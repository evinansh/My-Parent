package com.evinanshsapplication.app.modules.login.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEMail: String? = MyApp.getInstance().resources.getString(R.string.lbl_e_mail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonthaveacco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOR: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonText: String? = MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputOneValue: String? = null
)
