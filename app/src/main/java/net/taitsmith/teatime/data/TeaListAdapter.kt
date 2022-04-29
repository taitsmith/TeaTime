package net.taitsmith.teatime.data

import android.content.Context
import io.realm.RealmResults
import android.widget.BaseAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import net.taitsmith.teatime.databinding.TeaListItemBinding

class TeaListAdapter(context: Context?, var teaList: RealmResults<Tea>) : BaseAdapter() {
    var inflater: LayoutInflater = LayoutInflater.from(context)
    var binding: TeaListItemBinding? = null
    override fun getCount(): Int {
        return teaList.size
    }



    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var view: View? = p1
        val holder: ViewHolder
        if (view == null) {
            binding = TeaListItemBinding.inflate(
                inflater,
                p2,
                false
            )
            view = binding!!.root
            holder = ViewHolder()
            view.tag = holder
        }
        binding!!.tea = teaList[p0]
        return view
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    private inner class ViewHolder

}