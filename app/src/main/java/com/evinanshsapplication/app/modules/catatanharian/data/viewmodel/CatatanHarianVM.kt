package com.evinanshsapplication.app.modules.catatanharian.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.catatanharian.`data`.model.CatatanHarianModel
import org.koin.core.KoinComponent

class CatatanHarianVM : ViewModel(), KoinComponent {
  val catatanHarianModel: MutableLiveData<CatatanHarianModel> =
      MutableLiveData(CatatanHarianModel())

  var navArguments: Bundle? = null
}
