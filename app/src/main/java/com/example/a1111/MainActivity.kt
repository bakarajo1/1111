package com.example.a1111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import com.example.a1111.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var animation: Animation? = null
    var animation1: Animation? = null
    var a: Animation? = null
    var textView: TextView? = null
    lateinit var btn2 : View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.abc)
        animation1 = AnimationUtils.loadAnimation(this@MainActivity, R.anim.abz)
        btn2=binding.img1
    }

    fun kkk(view: View) {
        btn2.startAnimation(animation1)
        view.startAnimation(animation)

    }
}