package com.evinanshsapplication.app.modules.motivasionboarding.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityMotivasiOnboardingBinding
import com.evinanshsapplication.app.modules.beranda.ui.BerandaActivity
import com.evinanshsapplication.app.modules.motivasionboarding.`data`.viewmodel.MotivasiOnboardingVM
import kotlin.String
import kotlin.Unit

class MotivasiOnboardingActivity :
    BaseActivity<ActivityMotivasiOnboardingBinding>(R.layout.activity_motivasi_onboarding) {
  private val viewModel: MotivasiOnboardingVM by viewModels<MotivasiOnboardingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.motivasiOnboardingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearMotivasiOnboar.setOnClickListener {
      val destIntent = BerandaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "MOTIVASI_ONBOARDING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MotivasiOnboardingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
