package com.example.bestpro.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.Log
import androidx.activity.viewModels
import com.example.base.BaseActivity
import com.example.bestpro.R
import com.example.bestpro.databinding.ActivityJetpackBinding
import com.example.bestpro.jetpack.MainFragment
import com.example.bestpro.jetpack.MyViewHolder

class JetpackActivity : BaseActivity() {

    private lateinit var binding: ActivityJetpackBinding

    private val myViewModel by viewModels<MyViewHolder>()
    private val TAG = "JetpackActivity"
    private lateinit var displayMetrics:DisplayMetrics


    companion object {
        fun actionStart(context: Context) {
            val intent = Intent(context, JetpackActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJetpackBinding.inflate(layoutInflater)
        myViewModel.getTestData("初始化viewmodel")
        initFragment()
        setContentView(binding.root)
        binding.acbRequestData.setOnClickListener {
            myViewModel.getTestData("activity的")
        }
        myViewModel.testLiveData.observe(this) {
            Log.e(TAG, "onCreate: $it")
        }
       displayMetrics = this.resources.displayMetrics
        Log.e(TAG, "onCreate:density ==${displayMetrics.density}//dpi=${displayMetrics.densityDpi}", )

    }

    private fun initFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        val fragment = MainFragment.newInstance()
        transaction.add(R.id.frament_container, fragment)
        transaction.commit()
    }
}