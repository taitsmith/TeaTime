package net.taitsmith.teatime.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
import io.realm.kotlin.InitialDataCallback
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import io.realm.kotlin.ext.query
import io.realm.kotlin.notifications.InitialResults
import io.realm.kotlin.notifications.ResultsChange
import io.realm.kotlin.query.RealmResults
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.flow.Flow
import net.taitsmith.teatime.R
import net.taitsmith.teatime.data.Tea
import net.taitsmith.teatime.databinding.ActivityMainBinding
import net.taitsmith.teatime.ui.TeaDetailFragment
import net.taitsmith.teatime.ui.TeaListFragment
import net.taitsmith.teatime.viewmodels.MainViewModel

class MainActivity : AppCompatActivity() {
    private var sortBy: String? = null
    private var selection: String? = null
    private var position = 0
    private var isTwoPane = false
    private var manager: FragmentManager? = null
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        if (savedInstanceState == null) {
            sortBy = "all"
            selection = null
            position = 0
        } else {
            sortBy = savedInstanceState.getString("SORT_ORDER")
            selection = savedInstanceState.getString("SORT_SELECTION")
            position = savedInstanceState.getInt("POSITION")
        }

        isTwoPane = findViewById<View?>(R.id.tea_detail_fragment) != null

        manager = supportFragmentManager

        checkPrefs()
        setUi()

        createDb()
    }

    private fun createDb() {
        val bundledRealmConfig = RealmConfiguration.Builder(setOf(Tea::class))
            .initialRealmFile("assets/tea.realm")
            .schemaVersion(4L)
            .build()

        val bundledRealm = Realm.open(bundledRealmConfig)
        val teas: RealmResults<Tea> = bundledRealm.query<Tea>().find()
        for (tea in teas) {
            Log.d("TEA: ", tea.name)
        }
        bundledRealm.close()
    }

    private fun setUi() {
        if (isTwoPane) {
            val listFragment = TeaListFragment()
            val teaDetailFragment = TeaDetailFragment()

            setSupportActionBar(binding.toolbar!!.toolbar)
            manager!!.beginTransaction()
                .add(R.id.tea_list_fragment, listFragment)
                .add(R.id.tea_detail_fragment, teaDetailFragment)
                .commit()
        } else {
            setSupportActionBar(binding.toolbar1!!.toolbar)
            val teaListFragment = TeaListFragment()
            manager!!.beginTransaction()
                .add(R.id.tea_list_fragment, teaListFragment)
                .commit()
        }
    }

    fun onTeaSelected(position: Int) {
        this.position = position
        if (isTwoPane) {
            val fragment = TeaDetailFragment()
            manager!!.beginTransaction()
                .add(R.id.tea_detail_fragment, fragment)
                .commit()
        } else {
            val intent = Intent(this, TeaDetailActivity::class.java)
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
        setUi()
        return true
    }

    private fun checkPrefs() {
        val preferences = getSharedPreferences("SHARED_PREFS", 0)
        if (!preferences.contains("SHOW_EXP") || preferences.getBoolean("SHOW_EXP", false)) {
            mainViewModel.showExplanation(this)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.action_bar_menu, menu)
        return true
    }
}