package com.evinanshsapplication.app.modules.dataanak.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityDataAnakBinding
import com.evinanshsapplication.app.modules.dataanak.`data`.model.DataAnakRowModel
import com.evinanshsapplication.app.modules.dataanak.`data`.viewmodel.DataAnakVM
import com.evinanshsapplication.app.modules.motivasionboarding.ui.MotivasiOnboardingActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DataAnakActivity : BaseActivity<ActivityDataAnakBinding>(R.layout.activity_data_anak) {
  private val viewModel: DataAnakVM by viewModels<DataAnakVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val dataAnakAdapter = DataAnakAdapter(viewModel.dataAnakList.value?:mutableListOf())
    binding.recyclerDataAnak.adapter = dataAnakAdapter
    dataAnakAdapter.setOnItemClickListener(
    object : DataAnakAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DataAnakRowModel) {
        onClickRecyclerDataAnak(view, position, item)
      }
    }
    )
    viewModel.dataAnakList.observe(this) {
      dataAnakAdapter.updateData(it)
    }
    binding.dataAnakVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDataAnak.setOnClickListener {
      val destIntent = MotivasiOnboardingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerDataAnak(
    view: View,
    position: Int,
    item: DataAnakRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DATA_ANAK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DataAnakActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
