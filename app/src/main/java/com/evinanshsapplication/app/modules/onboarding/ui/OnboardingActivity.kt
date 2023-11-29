package com.evinanshsapplication.app.modules.onboarding.ui

import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityOnboardingBinding
import com.evinanshsapplication.app.modules.onboarding.`data`.viewmodel.OnboardingVM
import com.evinanshsapplication.app.modules.register.ui.RegisterActivity
import kotlin.String
import kotlin.Unit

class OnboardingActivity : BaseActivity<ActivityOnboardingBinding>(R.layout.activity_onboarding) {
  private val viewModel: OnboardingVM by viewModels<OnboardingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearOnboarding.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_ACTIVITY"

  }
}
