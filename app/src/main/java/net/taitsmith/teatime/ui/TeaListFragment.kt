package net.taitsmith.teatime.ui

import android.content.Context
import net.taitsmith.teatime.data.TeaListAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.AdapterView.OnItemClickListener
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import io.realm.RealmResults
import net.taitsmith.teatime.data.Tea
import net.taitsmith.teatime.databinding.TeaListFragmentBinding
import java.lang.ClassCastException

class TeaListFragment : Fragment() {
    private lateinit var adapter: TeaListAdapter
    lateinit var listener: OnTeaSelectedListener
    private lateinit var binding: TeaListFragmentBinding

    interface OnTeaSelectedListener {
        fun onTeaSelected(position: Int)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = try {
            context as OnTeaSelectedListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                context.toString() +
                        "Must implement OnTeaSelectedListener"
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TeaListFragmentBinding.inflate(inflater, container, false)
        adapter = TeaListAdapter(context, teaList!!)
        binding.teaListView.adapter = adapter
        binding.teaListView.onItemClickListener =
            OnItemClickListener { _: AdapterView<*>?, _: View?, position: Int, _: Long ->
                listener.onTeaSelected(position)
            }
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