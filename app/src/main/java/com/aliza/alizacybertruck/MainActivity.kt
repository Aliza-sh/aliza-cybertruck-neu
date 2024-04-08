package com.aliza.alizacybertruck

import android.os.Bundle
import com.aliza.alizacybertruck.base.BaseActivity
import com.aliza.alizacybertruck.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateBinding() = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}