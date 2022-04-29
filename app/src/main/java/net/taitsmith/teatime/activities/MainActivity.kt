package net.taitsmith.teatime.activities

import net.taitsmith.teatime.ui.TeaListFragment.Companion.setTeaList
import net.taitsmith.teatime.ui.TeaDetailFragment.Companion.setTea
import androidx.appcompat.app.AppCompatActivity
import net.taitsmith.teatime.ui.TeaListFragment.OnTeaSelectedListener
import io.realm.RealmResults
import net.taitsmith.teatime.data.Tea
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import net.taitsmith.teatime.R
import io.realm.RealmConfiguration
import net.taitsmith.teatime.data.TeaBrewer
import net.taitsmith.teatime.ui.TeaListFragment
import net.taitsmith.teatime.ui.TeaDetailFragment
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.FragmentManager
import io.realm.Realm
import net.taitsmith.teatime.data.Utils
import net.taitsmith.teatime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnTeaSelectedListener {
    private lateinit var realm: Realm
    private var sortBy: String? = null
    private var selection: String? = null
    private var position = 0
    private var isTwoPane = false
    private var teaList: RealmResults<Tea>? = null
    private var manager: FragmentManager? = null
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        if (savedInstanceState == null) {
            sortBy = "all"
            selection = null
            position = 0
        } else {
            sortBy = savedInstanceState.getString("SORT_ORDER")
            selection = savedInstanceState.getString("SORT_SELECTION")
            position = savedInstanceState.getInt("POSITION")
        }

        Realm.init(this)

        isTwoPane = findViewById<View?>(R.id.tea_detail_fragment) != null

        manager = supportFragmentManager

        realmConfiguration = RealmConfiguration.Builder()
            .name("teaRealm.realm")
            .build()

        realm = Realm.getInstance(realmConfiguration)

        if (realm.isEmpty) {
            TeaBrewer.populateRealm(this, realm)
        }

        teaList = Utils.teaList(sortBy!!, selection)
        checkPrefs()
        setUi()
    }

    private fun setUi() {
        if (isTwoPane) {
            val listFragment = TeaListFragment()
            val teaDetailFragment = TeaDetailFragment()
            setTeaList(teaList)
            setTea(teaList!![position]!!.name)
            setSupportActionBar(binding!!.toolbar!!.toolbar)
            manager!!.beginTransaction()
                .add(R.id.tea_list_fragment, listFragment)
                .add(R.id.tea_detail_fragment, teaDetailFragment)
                .commit()
        } else {
            setSupportActionBar(binding!!.toolbar1!!.toolbar)
            val teaListFragment = TeaListFragment()
            setTeaList(teaList)
            manager!!.beginTransaction()
                .add(R.id.tea_list_fragment, teaListFragment)
                .commit()
        }
    }

    override fun onTeaSelected(position: Int) {
        this.position = position
        if (isTwoPane) {
            val fragment = TeaDetailFragment()
            setTea(teaList!![position]!!.name)
            manager!!.beginTransaction()
                .add(R.id.tea_detail_fragment, fragment)
                .commit()
        } else {
            val intent = Intent(this, TeaDetailActivity::class.java)
            intent.putExtra("TEA_NAME", teaList!![position]!!.name)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("SORT_ORDER", sortBy)
        outState.putInt("POSITION", position)
        if (selection != null) {
            outState.putString("SORT_SELECTION", selection)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.sort_china -> {
                sortBy = "region"
                selection = "China"
            }
            R.id.sort_japan -> {
                sortBy = "region"
                selection = "Japan"
            }
            R.id.sort_other_region -> {
                sortBy = "region"
                selection = "other"
            }
            R.id.sort_black -> {
                sortBy = "type"
                selection = "Black Tea"
            }
            R.id.sort_green -> {
                sortBy = "type"
                selection = "Green Tea"
            }
            R.id.sort_other_type -> {
                sortBy = "type"
                selection = "other"
            }
            else -> return super.onOptionsItemSelected(item)
        }
        teaList = Utils.teaList(sortBy!!, selection)
        setUi()
        return true
    }

    private fun checkPrefs() {
        val preferences = getSharedPreferences("SHARED_PREFS", 0)
        if (!preferences.contains("SHOW_EXP") || preferences.getBoolean("SHOW_EXP", false)) {
            Utils.showExplanation(this)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.action_bar_menu, menu)
        return true
    }

    companion object {
        lateinit var realmConfiguration: RealmConfiguration

    }
}