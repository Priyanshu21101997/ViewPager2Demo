package com.example.viewpager2demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        val images = listOf(R.drawable.thumb,R.drawable.thumb1,R.drawable.thumb2,R.drawable.thumb3,
            R.drawable.thumb4,R.drawable.thumb5)

        val viewPagerAdapter = ViewPageAdapter(images)
        viewPager.adapter = viewPagerAdapter
    }
}