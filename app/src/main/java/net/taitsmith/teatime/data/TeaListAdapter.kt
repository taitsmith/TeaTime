package net.taitsmith.teatime.data

import android.content.Context
import io.realm.RealmResults
import android.widget.BaseAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import net.taitsmith.teatime.databinding.TeaListItemBinding

class TeaListAdapter(
    private val onItemClicked: (Tea) -> Unit
): ListAdapter<Tea, TeaListAdapter.TeaViewHolder>(DiffCallback) {

    companion object {
        private val DiffCallback = object: DiffUtil.ItemCallback<Tea>() {
            override fun areItemsTheSame(oldItem: Tea, newItem: Tea): Boolean {
                return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Tea, newItem: Tea): Boolean {
                return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TeaViewHolder {
        val viewHolder = TeaViewHolder(
            TeaListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

        viewHolder.itemView.setOnClickListener {
            val position = viewHolder.adapterPosition
            onItemClicked(getItem(position))
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: TeaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class TeaViewHolder(
        private var binding: TeaListItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(tea: Tea) {
            binding.tea = tea
        }
    }
}