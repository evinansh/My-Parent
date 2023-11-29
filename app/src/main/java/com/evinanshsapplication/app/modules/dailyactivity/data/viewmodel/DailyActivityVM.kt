package com.evinanshsapplication.app.modules.dailyactivity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.dailyactivity.`data`.model.DailyActivityModel
import com.evinanshsapplication.app.modules.dailyactivity.`data`.model.ListsolarmoonsleeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DailyActivityVM : ViewModel(), KoinComponent {
  val dailyActivityModel: MutableLiveData<DailyActivityModel> =
      MutableLiveData(DailyActivityModel())

  var navArguments: Bundle? = null

  val listsolarmoonsleeList: MutableLiveData<MutableList<ListsolarmoonsleeRowModel>> =
      MutableLiveData(mutableListOf())
}
