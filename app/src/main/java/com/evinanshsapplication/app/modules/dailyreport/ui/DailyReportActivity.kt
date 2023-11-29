package com.evinanshsapplication.app.modules.dailyreport.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityDailyReportBinding
import com.evinanshsapplication.app.modules.dailyreport.`data`.viewmodel.DailyReportVM
import kotlin.String
import kotlin.Unit

class DailyReportActivity : BaseActivity<ActivityDailyReportBinding>(R.layout.activity_daily_report)
    {
  private val viewModel: DailyReportVM by viewModels<DailyReportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dailyReportVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DAILY_REPORT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DailyReportActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
