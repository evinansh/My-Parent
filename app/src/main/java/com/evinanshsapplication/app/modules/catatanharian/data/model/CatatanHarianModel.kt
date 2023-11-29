package com.evinanshsapplication.app.modules.catatanharian.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CatatanHarianModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_month_old)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_syakila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_catatan_harian)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTulisCatatan: String? = MyApp.getInstance().resources.getString(R.string.lbl_tulis_catatan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJudul: String? = MyApp.getInstance().resources.getString(R.string.lbl_judul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_save)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenin20novem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_senin_20_novem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenin20novemOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_senin_20_novem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFortyFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_rabu_22_novemb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangle4747Value: String? = null
)
