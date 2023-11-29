package com.evinanshsapplication.app.modules.dailychallenge.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseFragment
import com.evinanshsapplication.app.databinding.FragmentDailyChallengeBinding
import com.evinanshsapplication.app.modules.dailychallenge.`data`.model.ListvectorOneRowModel
import com.evinanshsapplication.app.modules.dailychallenge.`data`.viewmodel.DailyChallengeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DailyChallengeFragment :
    BaseFragment<FragmentDailyChallengeBinding>(R.layout.fragment_daily_challenge) {
  private val viewModel: DailyChallengeVM by viewModels<DailyChallengeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listvectorOneAdapter =
    ListvectorOneAdapter(viewModel.listvectorOneList.value?:mutableListOf())
    binding.recyclerListvectorOne.adapter = listvectorOneAdapter
    listvectorOneAdapter.setOnItemClickListener(
    object : ListvectorOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvectorOneRowModel) {
        onClickRecyclerListvectorOne(view, position, item)
      }
    }
    )
    viewModel.listvectorOneList.observe(requireActivity()) {
      listvectorOneAdapter.updateData(it)
    }
    binding.dailyChallengeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListvectorOne(
    view: View,
    position: Int,
    item: ListvectorOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DAILY_CHALLENGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): DailyChallengeFragment {
      val fragment = DailyChallengeFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
