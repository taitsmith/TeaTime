package net.taitsmith.teatime.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import net.taitsmith.teatime.data.Tea
import net.taitsmith.teatime.databinding.TeaFragmentBinding

class TeaDetailFragment : Fragment() {
    private var tea: Tea? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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