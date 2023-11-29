package com.evinanshsapplication.app.modules.dataanak.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.databinding.RowDataAnakBinding
import com.evinanshsapplication.app.modules.dataanak.`data`.model.DataAnakRowModel
import kotlin.Int
import kotlin.collections.List

class DataAnakAdapter(
  var list: List<DataAnakRowModel>
) : RecyclerView.Adapter<DataAnakAdapter.RowDataAnakVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDataAnakVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_data_anak,parent,false)
    return RowDataAnakVH(view)
  }

  override fun onBindViewHolder(holder: RowDataAnakVH, position: Int) {
    val dataAnakRowModel = DataAnakRowModel()
    // TODO uncomment following line after integration with data source
    // val dataAnakRowModel = list[position]
    holder.binding.dataAnakRowModel = dataAnakRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DataAnakRowModel>) {
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
      item: DataAnakRowModel
    ) {
    }
  }

  inner class RowDataAnakVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDataAnakBinding = RowDataAnakBinding.bind(itemView)
  }
}
