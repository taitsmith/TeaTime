package net.taitsmith.teatime.ui

import net.taitsmith.teatime.data.Tea
import android.os.Bundle
import net.taitsmith.teatime.activities.MainActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import io.realm.Realm
import net.taitsmith.teatime.databinding.TeaFragmentBinding

class TeaDetailFragment : Fragment() {
    private var tea: Tea? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val realm = Realm.getInstance(MainActivity.realmConfiguration)
        tea = realm.where(Tea::class.java)
            .equalTo("name", name)
            .findFirst()
        realm.close()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = TeaFragmentBinding.inflate(inflater)
        binding.tea = tea
        return binding.root
    }

    companion object {
        private var name: String? = null
        @JvmStatic
        fun setTea(s: String?) {
            name = s
        }
    }
}