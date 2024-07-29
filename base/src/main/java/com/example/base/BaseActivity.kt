package com.example.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import utils.ActivityCollector
import utils.LogUtil

open class BaseActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(getBinding())
        LogUtil.d("BaseActivity", javaClass.simpleName)
        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        ActivityCollector.removeActivity(this)
    }



}