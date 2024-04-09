package com.aliza.alizacybertruck

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import com.aliza.alizacybertruck.base.BaseActivity
import com.aliza.alizacybertruck.databinding.ActivityManagCarBinding
import soup.neumorphism.NeumorphCardView
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class ManagCarActivity : BaseActivity<ActivityManagCarBinding>() {
    override fun inflateBinding(): ActivityManagCarBinding = ActivityManagCarBinding.inflate(layoutInflater)

    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnUnlock.setOnClickListener {
            finish()
        }

        middleButtons()
        buttonsBelow()


    }

    @SuppressLint("RestrictedApi")
    private fun middleButtons() {

        binding.btnEnginMode.setOnClickListener {
            val shapeType = (it as NeumorphCardView).getShapeType()
            if (shapeType == ShapeType.BASIN) {
                it.setShapeType(ShapeType.FLAT)
                binding.imgEnginMode.visibility = INVISIBLE
            } else {

                it.setShapeType(ShapeType.BASIN)
                binding.imgEnginMode.visibility = VISIBLE

            }
        }

        binding.btnClimateMode.setOnClickListener {
            val shapeType = (it as NeumorphCardView).getShapeType()
            if (shapeType == ShapeType.BASIN) {
                it.setShapeType(ShapeType.FLAT)
                binding.imgClimateMode.visibility = INVISIBLE
            } else {

                it.setShapeType(ShapeType.BASIN)
                binding.imgClimateMode.visibility = VISIBLE

            }
        }

        binding.btnTiresMode.setOnClickListener {
            val shapeType = (it as NeumorphCardView).getShapeType()
            if (shapeType == ShapeType.BASIN) {
                it.setShapeType(ShapeType.FLAT)
                binding.imgTiresMode.visibility = INVISIBLE
            } else {

                it.setShapeType(ShapeType.BASIN)
                binding.imgTiresMode.visibility = VISIBLE

            }
        }

        binding.btnDirectionMode.setOnClickListener {
            val shapeType = (it as NeumorphCardView).getShapeType()
            if (shapeType == ShapeType.BASIN) {
                it.setShapeType(ShapeType.FLAT)
                binding.imgDirectionMode.visibility = INVISIBLE
            } else {

                it.setShapeType(ShapeType.BASIN)
                binding.imgDirectionMode.visibility = VISIBLE

            }
        }
    }

    @SuppressLint("RestrictedApi")
    private fun buttonsBelow() {
        binding.btnBattery.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnDry.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnRange.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnProgram.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }

        binding.btnDry.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnBattery.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnBattery.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnRange.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnProgram.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }

        binding.btnRange.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnBattery.setShapeType(ShapeType.FLAT)
                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnBattery.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnDry.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnProgram.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }

        binding.btnProgram.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnBattery.setShapeType(ShapeType.FLAT)
                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)

                binding.btnBattery.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnDry.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnRange.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
    }
}