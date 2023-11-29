package com.evinanshsapplication.app.modules.dailychallengee.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.dailychallengee.`data`.model.DailyChallengeeModel
import org.koin.core.KoinComponent

class DailyChallengeeVM : ViewModel(), KoinComponent {
  val dailyChallengeeModel: MutableLiveData<DailyChallengeeModel> =
      MutableLiveData(DailyChallengeeModel())

  var navArguments: Bundle? = null
}
