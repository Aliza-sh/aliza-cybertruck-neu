package com.aliza.alizacybertruck

import android.content.Intent
import android.os.Bundle
import com.aliza.alizacybertruck.base.BaseActivity
import com.aliza.alizacybertruck.databinding.ActivityOpenCarBinding

class OpenCarActivity : BaseActivity<ActivityOpenCarBinding>() {
    override fun inflateBinding() = ActivityOpenCarBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.btnOpenCar.setOnClickListener {
            val intent = Intent(this,ManagCarActivity::class.java)
            startActivity(intent)
        }
    }
}