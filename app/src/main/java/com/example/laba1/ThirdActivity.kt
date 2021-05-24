package com.example.laba1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third)
    }

    fun onClickCreate3(view: View) {
        val intent = Intent(this, BottomNavigation::class.java)
        startActivity(intent)
    }

    fun onClickBack3(view: View) {
        val intent = Intent(this, StartActivity::class.java)
        startActivity(intent)
    }

    fun onClickForgotPassword(view: View) {
        val intent = Intent(this, TwelfthActivity::class.java)
        startActivity(intent)
    }

}