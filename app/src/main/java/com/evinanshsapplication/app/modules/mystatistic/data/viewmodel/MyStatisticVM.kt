package com.evinanshsapplication.app.modules.mystatistic.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.mystatistic.`data`.model.MyStatisticModel
import org.koin.core.KoinComponent

class MyStatisticVM : ViewModel(), KoinComponent {
  val myStatisticModel: MutableLiveData<MyStatisticModel> = MutableLiveData(MyStatisticModel())

  var navArguments: Bundle? = null
}
