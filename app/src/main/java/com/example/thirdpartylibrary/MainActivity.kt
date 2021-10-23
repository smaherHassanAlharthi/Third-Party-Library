package com.example.thirdpartylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.core.widget.addTextChangedListener

import androidx.viewpager.widget.ViewPager
import android.text.Editable

import android.text.TextWatcher
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import me.grantland.widget.AutofitHelper


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.texthere)
        val et = findViewById<EditText>(R.id.etText)
        AutofitHelper.create(tv)
        et.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable) {
                tv.text=s.toString()
            }

        })
    }
    fun turn(v:View){
        val animation=findViewById<LottieAnimationView>(R.id.animationView)
        animation.playAnimation()
    }
}