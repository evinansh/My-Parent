package com.evinanshsapplication.app.modules.dailychallenge.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DailyChallengeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_daily_challenge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_month_old)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_syakila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandstomouth: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hands_to_mouth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHandstomouthOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hands_to_mouth)

)
