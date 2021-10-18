package com.example.imageviewsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
img=findViewById(R.id.imageView)

    }

    fun b1(view: android.view.View) {img.setBackgroundResource(R.drawable.morning)}
    fun b2(view: android.view.View) {img.setBackgroundResource(R.drawable.night)}
}