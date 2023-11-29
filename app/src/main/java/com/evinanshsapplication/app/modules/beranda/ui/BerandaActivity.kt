package com.evinanshsapplication.app.modules.beranda.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityBerandaBinding
import com.evinanshsapplication.app.modules.beranda.`data`.viewmodel.BerandaVM
import kotlin.String
import kotlin.Unit

class BerandaActivity : BaseActivity<ActivityBerandaBinding>(R.layout.activity_beranda) {
  private val viewModel: BerandaVM by viewModels<BerandaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.berandaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BERANDA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BerandaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
