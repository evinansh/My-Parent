package com.evinanshsapplication.app.modules.dailyreport.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.dailyreport.`data`.model.DailyReportModel
import org.koin.core.KoinComponent

class DailyReportVM : ViewModel(), KoinComponent {
  val dailyReportModel: MutableLiveData<DailyReportModel> = MutableLiveData(DailyReportModel())

  var navArguments: Bundle? = null
}
