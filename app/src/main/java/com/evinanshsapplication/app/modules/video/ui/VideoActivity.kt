package com.evinanshsapplication.app.modules.video.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.evinanshsapplication.app.R
import com.evinanshsapplication.app.appcomponents.base.BaseActivity
import com.evinanshsapplication.app.databinding.ActivityVideoBinding
import com.evinanshsapplication.app.modules.beranda.ui.BerandaActivity
import com.evinanshsapplication.app.modules.video.`data`.viewmodel.VideoVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class VideoActivity : BaseActivity<ActivityVideoBinding>(R.layout.activity_video) {
  private val viewModel: VideoVM by viewModels<VideoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.videoVM = viewModel
    setUpSearchViewGroupFiftyOneListener()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowarrowleft.setOnClickListener {
      val destIntent = BerandaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewGroupFiftyOneListener(): Unit {
    binding.searchViewGroupFiftyOne.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "VIDEO_ACTIVITY"

    }
  }
