package com.evinanshsapplication.app.modules.dailychallenge.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListvectorOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEyeContact: String? = MyApp.getInstance().resources.getString(R.string.lbl_eye_contact)

)
