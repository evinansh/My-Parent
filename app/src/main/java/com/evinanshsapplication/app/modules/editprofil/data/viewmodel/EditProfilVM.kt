package com.evinanshsapplication.app.modules.editprofil.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.evinanshsapplication.app.modules.editprofil.`data`.model.EditProfilModel
import org.koin.core.KoinComponent

class EditProfilVM : ViewModel(), KoinComponent {
  val editProfilModel: MutableLiveData<EditProfilModel> = MutableLiveData(EditProfilModel())

  var navArguments: Bundle? = null
}
