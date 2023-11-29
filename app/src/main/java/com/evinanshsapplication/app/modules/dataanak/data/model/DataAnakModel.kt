package com.evinanshsapplication.app.modules.dataanak.`data`.model

import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DataAnakModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukanInforma: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukan_informa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_silahkan_masuka)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTanggalLahir: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanggal_lahir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenisKelamin: String? = MyApp.getInstance().resources.getString(R.string.lbl_jenis_kelamin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenisKelaminOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jenis_kelamin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJenisKelaminTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jenis_kelamin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBerattinggi: String? = MyApp.getInstance().resources.getString(R.string.lbl_berat_tinggi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etLanguageOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwoValue: String? = null
)
