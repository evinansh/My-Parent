package com.evinanshsapplication.app.modules.dailyactivity.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListsolarmoonsleeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSleep: String? = MyApp.getInstance().resources.getString(R.string.lbl_sleep)

)
