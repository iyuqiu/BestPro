package com.example.bestpro.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.base.BaseActivity
import com.example.bestpro.adapter.MainAdapter
import com.example.bestpro.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    private val titleList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initTitles()
        binding.rvList.layoutManager = LinearLayoutManager(this)
        val adapter = MainAdapter(titleList) {
            when (it) {
                0 -> {
                    SecondActivity.actionStart(this, "小马", 18)
                }

                1 -> {
                    JetpackActivity.actionStart(this)
                }
            }
        }
        binding.rvList.adapter = adapter

    }

    private fun initTitles() {
        titleList.add("跳转的最佳实践")
        titleList.add("Jetpack最佳实践")
    }
}