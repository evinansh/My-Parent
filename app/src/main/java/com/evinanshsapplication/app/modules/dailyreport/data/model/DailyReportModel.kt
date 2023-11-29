package com.evinanshsapplication.app.modules.dailyreport.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DailyReportModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistic)
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
  var txtTostartworkin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sleep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTostartworkinOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_bath)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTostartworkinTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_eat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTostartworkinThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_diaper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeading: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_june)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadingOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_daily_activity2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTostartworkinFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_bath)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTostartworkinFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_sleep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTostartworkinSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_eat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTostartworkinSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_diaper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSleepTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sleep)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEatTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_eat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDiaperTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_diaper)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBathTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bath)

)
