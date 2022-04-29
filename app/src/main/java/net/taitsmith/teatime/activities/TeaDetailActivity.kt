package net.taitsmith.teatime.activities

import net.taitsmith.teatime.ui.TeaDetailFragment.Companion.setTea
import androidx.appcompat.app.AppCompatActivity
import net.taitsmith.teatime.data.Tea
import android.os.Bundle
import io.realm.Realm
import net.taitsmith.teatime.R
import net.taitsmith.teatime.ui.TeaDetailFragment

/**
 * For phone mode only, displays a [TeaDetailFragment]
 */
class TeaDetailActivity : AppCompatActivity() {
    private var name: String? = null
    private var tea: Tea? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tea_detail)
        val realm = Realm.getInstance(MainActivity.realmConfiguration)
        if (intent.hasExtra("TEA_NAME")) {
            name = intent.getStringExtra("TEA_NAME")
        }
        if (savedInstanceState != null) {
            name = savedInstanceState.getString("TEA_NAME")
        }
        tea = realm.where(Tea::class.java)
            .equalTo("name", name)
            .findFirst()
        val teaDetailFragment = TeaDetailFragment()
        val manager = supportFragmentManager
        setTea(name)
        manager.beginTransaction()
            .add(R.id.tea_detail_fragment, teaDetailFragment)
            .commit()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("TEA_NAME", name)
    }
}