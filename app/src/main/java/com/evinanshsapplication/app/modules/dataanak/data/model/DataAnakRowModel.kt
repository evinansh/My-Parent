package com.evinanshsapplication.app.modules.dataanak.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DataAnakRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBeratbadan: String? = MyApp.getInstance().resources.getString(R.string.lbl_berat_badan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKg: String? = MyApp.getInstance().resources.getString(R.string.lbl_kg)

)
