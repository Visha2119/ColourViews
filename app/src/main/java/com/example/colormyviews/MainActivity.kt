package com.example.colormyviews

import android.graphics.Color
import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val clickableViews: List<View> = listOf(box1,box2,box3,box4,box5,Red, yellow_button,green_button)
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View) {
        when (view.id) {

            //  using Color class colors for background
            R.id.box1 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box2 -> view.setBackgroundColor(Color.GRAY)

            //  using Android color resources for background
            R.id.box3 -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box5 -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.Red -> box3.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.yellow_button -> box4.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.green_button -> box5.setBackgroundResource(android.R.color.holo_green_dark)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
    }


