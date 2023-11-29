package com.evinanshsapplication.app.modules.motivasionboarding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.motivasionboarding.`data`.model.MotivasiOnboardingModel
import org.koin.core.KoinComponent

class MotivasiOnboardingVM : ViewModel(), KoinComponent {
  val motivasiOnboardingModel: MutableLiveData<MotivasiOnboardingModel> =
      MutableLiveData(MotivasiOnboardingModel())

  var navArguments: Bundle? = null
}
