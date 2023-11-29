package com.evinanshsapplication.app.modules.dataanak.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.dataanak.`data`.model.DataAnakModel
import com.evinanshsapplication.app.modules.dataanak.`data`.model.DataAnakRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DataAnakVM : ViewModel(), KoinComponent {
  val dataAnakModel: MutableLiveData<DataAnakModel> = MutableLiveData(DataAnakModel())

  var navArguments: Bundle? = null

  val dataAnakList: MutableLiveData<MutableList<DataAnakRowModel>> =
      MutableLiveData(mutableListOf())
}
