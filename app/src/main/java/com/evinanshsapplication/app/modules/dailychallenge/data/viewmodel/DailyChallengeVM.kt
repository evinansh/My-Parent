package com.evinanshsapplication.app.modules.dailychallenge.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.dailychallenge.`data`.model.DailyChallengeModel
import com.evinanshsapplication.app.modules.dailychallenge.`data`.model.ListvectorOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DailyChallengeVM : ViewModel(), KoinComponent {
  val dailyChallengeModel: MutableLiveData<DailyChallengeModel> =
      MutableLiveData(DailyChallengeModel())

  var navArguments: Bundle? = null

  val listvectorOneList: MutableLiveData<MutableList<ListvectorOneRowModel>> =
      MutableLiveData(mutableListOf())
}
