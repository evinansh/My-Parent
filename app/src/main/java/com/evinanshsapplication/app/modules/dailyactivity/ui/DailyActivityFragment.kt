package com.evinanshsapplication.app.modules.dailyactivity.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseFragment
import com.evinanshsapplication.app.databinding.FragmentDailyActivityBinding
import com.evinanshsapplication.app.modules.beranda.ui.BerandaActivity
import com.evinanshsapplication.app.modules.dailyactivity.`data`.model.ListsolarmoonsleeRowModel
import com.evinanshsapplication.app.modules.dailyactivity.`data`.viewmodel.DailyActivityVM
import com.evinanshsapplication.app.modules.dailyreport.ui.DailyReportActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DailyActivityFragment :
    BaseFragment<FragmentDailyActivityBinding>(R.layout.fragment_daily_activity) {
  private val viewModel: DailyActivityVM by viewModels<DailyActivityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsolarmoonsleeAdapter =
    ListsolarmoonsleeAdapter(viewModel.listsolarmoonsleeList.value?:mutableListOf())
    binding.recyclerListsolarmoonslee.adapter = listsolarmoonsleeAdapter
    listsolarmoonsleeAdapter.setOnItemClickListener(
    object : ListsolarmoonsleeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsolarmoonsleeRowModel) {
        onClickRecyclerListsolarmoonslee(view, position, item)
      }
    }
    )
    viewModel.listsolarmoonsleeList.observe(requireActivity()) {
      listsolarmoonsleeAdapter.updateData(it)
    }
    binding.dailyActivityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageGroup.setOnClickListener {
      val destIntent = DailyReportActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.imageVector.setOnClickListener {
      val destIntent = BerandaActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListsolarmoonslee(
    view: View,
    position: Int,
    item: ListsolarmoonsleeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DAILY_ACTIVITY_FRAGMENT"


    fun getInstance(bundle: Bundle?): DailyActivityFragment {
      val fragment = DailyActivityFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
