package net.taitsmith.teatime.ui

import android.content.Context
import android.content.Intent
import net.taitsmith.teatime.data.TeaListAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import io.realm.RealmResults
import net.taitsmith.teatime.R
import net.taitsmith.teatime.activities.MainActivity
import net.taitsmith.teatime.data.Tea
import net.taitsmith.teatime.databinding.TeaListFragmentBinding
import java.lang.ClassCastException

class TeaListFragment : Fragment() {
    private lateinit var binding: TeaListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TeaListFragmentBinding.inflate(inflater, container, false)
        val adapter = TeaListAdapter {
            tea -> Toast.makeText(context, tea.name, Toast.LENGTH_LONG).show()
        }
        binding.teaListView.adapter = adapter
        binding.teaListView.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

    companion object {
        private var teaList: RealmResults<Tea>? = null
        @JvmStatic
        fun setTeaList(realmResults: RealmResults<Tea>?) {
            teaList = realmResults
        }
    }
}