package com.evinanshsapplication.app.modules.dailychallenge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.databinding.RowListvectorOneBinding
import com.evinanshsapplication.app.modules.dailychallenge.`data`.model.ListvectorOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListvectorOneAdapter(
  var list: List<ListvectorOneRowModel>
) : RecyclerView.Adapter<ListvectorOneAdapter.RowListvectorOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvectorOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvector_one,parent,false)
    return RowListvectorOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListvectorOneVH, position: Int) {
    val listvectorOneRowModel = ListvectorOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listvectorOneRowModel = list[position]
    holder.binding.listvectorOneRowModel = listvectorOneRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListvectorOneRowModel>) {
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
      item: ListvectorOneRowModel
    ) {
    }
  }

  inner class RowListvectorOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvectorOneBinding = RowListvectorOneBinding.bind(itemView)
  }
}
