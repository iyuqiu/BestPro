package com.example.bestpro.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.base.BaseActivity
import com.example.bestpro.databinding.ActivitySecondBinding

class SecondActivity : BaseActivity() {

    private var name: String? = null
    private var age: Int? = 0
    private lateinit var binding: ActivitySecondBinding

    companion object {
        const val KEY_NAME = "name"
        const val KEY_AGE = "age"
        fun actionStart(context: Context, name: String, age: Int) {
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra(KEY_NAME, name)
                putExtra(KEY_AGE, age)
            }
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        age = intent.getIntExtra(KEY_AGE, 0)
        name = intent.getStringExtra(KEY_NAME)
        "name=${name}/age=${age}".also { binding.actvContent.text = it }
    }
}