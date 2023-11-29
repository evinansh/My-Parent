package com.evinanshsapplication.app.modules.mystatistic.ui

import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityMyStatisticBinding
import com.evinanshsapplication.app.modules.mystatistic.`data`.viewmodel.MyStatisticVM
import com.evinanshsapplication.app.modules.profil.ui.ProfilActivity
import kotlin.String
import kotlin.Unit

class MyStatisticActivity : BaseActivity<ActivityMyStatisticBinding>(R.layout.activity_my_statistic)
    {
  private val viewModel: MyStatisticVM by viewModels<MyStatisticVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myStatisticVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowvector.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MY_STATISTIC_ACTIVITY"

  }
}
