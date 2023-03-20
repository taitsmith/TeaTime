package net.taitsmith.teatime.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import net.taitsmith.teatime.data.TeaListAdapter
import net.taitsmith.teatime.databinding.TeaListFragmentBinding

class TeaListFragment : Fragment() {
    private var _binding: TeaListFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = TeaListFragmentBinding.inflate(inflater, container, false)
        val adapter = TeaListAdapter {
            tea -> Toast.makeText(context, tea.name, Toast.LENGTH_LONG).show()
        }
        binding.teaListView.adapter = adapter
        binding.teaListView.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

}