package net.taitsmith.teatime.data

import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.compositionContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.google.accompanist.themeadapter.material.MdcTheme

class TeaListAdapter(
    private val onItemClicked: (Tea) -> Unit
): ListAdapter<Tea, TeaListAdapter.TeaViewHolder>(DiffCallback) {

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<Tea>() {
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
        return TeaViewHolder(
            ComposeView(parent.context),
            onItemClicked
        )
    }

    override fun onBindViewHolder(holder: TeaViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class TeaViewHolder(
        private val composeView: ComposeView,
        private val onItemClicked: (Tea) -> Unit,
    ) : RecyclerView.ViewHolder(composeView) {
        fun bind(tea: Tea) {
            composeView.setContent {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            onItemClicked(tea)
                        }
                        .padding(vertical = 8.dp, horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TeaDetails(tea, Modifier.weight(1f))
                }
            }
        }
    }
}
    
    @Composable
    fun TeaDetails(tea: Tea, modifier: Modifier = Modifier) {
        Column(modifier, verticalArrangement = Arrangement.Top) {
            Text(
                text = tea.name,
                style = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.Bold)
            )
            Text(tea.type)
        }
    }
