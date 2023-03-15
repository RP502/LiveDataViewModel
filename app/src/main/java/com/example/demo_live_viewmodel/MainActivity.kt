package com.example.demo_live_viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var viewModel: LiveViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[LiveViewModel::class.java]
        viewModel.count.observe(
            this, Observer {
                tvCount.text = it.toString()
            }
        )

        btnCount.setOnClickListener {
            viewModel.updateCount()
        }
    }
}