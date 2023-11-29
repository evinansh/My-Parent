package com.evinanshsapplication.app.modules.dailyactivity.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.databinding.RowListsolarmoonsleeBinding
import com.evinanshsapplication.app.modules.dailyactivity.`data`.model.ListsolarmoonsleeRowModel
import kotlin.Int
import kotlin.collections.List

class ListsolarmoonsleeAdapter(
  var list: List<ListsolarmoonsleeRowModel>
) : RecyclerView.Adapter<ListsolarmoonsleeAdapter.RowListsolarmoonsleeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsolarmoonsleeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsolarmoonslee,parent,false)
    return RowListsolarmoonsleeVH(view)
  }

  override fun onBindViewHolder(holder: RowListsolarmoonsleeVH, position: Int) {
    val listsolarmoonsleeRowModel = ListsolarmoonsleeRowModel()
    // TODO uncomment following line after integration with data source
    // val listsolarmoonsleeRowModel = list[position]
    holder.binding.listsolarmoonsleeRowModel = listsolarmoonsleeRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsolarmoonsleeRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListsolarmoonsleeRowModel
    ) {
    }
  }

  inner class RowListsolarmoonsleeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsolarmoonsleeBinding = RowListsolarmoonsleeBinding.bind(itemView)
  }
}
