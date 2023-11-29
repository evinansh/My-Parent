package com.evinanshsapplication.app.modules.dailychallengee.ui

import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityDailyChallengeeBinding
import com.evinanshsapplication.app.extensions.loadFragment
import com.evinanshsapplication.app.modules.dailyactivity.ui.DailyActivityFragment
import com.evinanshsapplication.app.modules.dailychallenge.ui.DailyChallengeFragment
import com.evinanshsapplication.app.modules.dailychallengee.`data`.viewmodel.DailyChallengeeVM
import kotlin.String
import kotlin.Unit

class DailyChallengeeActivity :
    BaseActivity<ActivityDailyChallengeeBinding>(R.layout.activity_daily_challengee) {
  private val viewModel: DailyChallengeeVM by viewModels<DailyChallengeeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dailyChallengeeVM = viewModel
    val destFragment = DailyChallengeFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = DailyChallengeFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.imageUnion.setOnClickListener {
      val destFragment = DailyActivityFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = DailyActivityFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.imageCategory.setOnClickListener {
      val destFragment = DailyChallengeFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = DailyChallengeFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "DAILY_CHALLENGEE_ACTIVITY"

  }
}
