package com.aliza.alizacybertruck

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aliza.alizacybertruck.base.BaseActivity
import com.aliza.alizacybertruck.databinding.ActivityManagCarBinding

class ManagCarActivity : BaseActivity<ActivityManagCarBinding>() {
    override fun inflateBinding(): ActivityManagCarBinding = ActivityManagCarBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnUnlock.setOnClickListener {
            finish()
        }
    }
}