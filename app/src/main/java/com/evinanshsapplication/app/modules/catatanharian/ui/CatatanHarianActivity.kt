package com.evinanshsapplication.app.modules.catatanharian.ui

import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityCatatanHarianBinding
import com.evinanshsapplication.app.modules.beranda.ui.BerandaActivity
import com.evinanshsapplication.app.modules.catatanharian.`data`.viewmodel.CatatanHarianVM
import kotlin.String
import kotlin.Unit

class CatatanHarianActivity :
    BaseActivity<ActivityCatatanHarianBinding>(R.layout.activity_catatan_harian) {
  private val viewModel: CatatanHarianVM by viewModels<CatatanHarianVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.catatanHarianVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowvector.setOnClickListener {
      val destIntent = BerandaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CATATAN_HARIAN_ACTIVITY"

  }
}
