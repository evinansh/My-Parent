package com.evinanshsapplication.app.modules.editprofil.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityEditProfilBinding
import com.evinanshsapplication.app.modules.editprofil.`data`.viewmodel.EditProfilVM
import com.evinanshsapplication.app.modules.profil.ui.ProfilActivity
import kotlin.String
import kotlin.Unit

class EditProfilActivity : BaseActivity<ActivityEditProfilBinding>(R.layout.activity_edit_profil) {
  private val viewModel: EditProfilVM by viewModels<EditProfilVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editProfilVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowvector.setOnClickListener {
      val destIntent = ProfilActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EDIT_PROFIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditProfilActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
