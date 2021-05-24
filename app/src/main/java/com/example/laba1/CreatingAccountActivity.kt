package com.example.laba1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class CreatingAccountActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
    }

    fun onClickCreateAccount(view: View) {
        val intent = Intent(this, BottomNavigation::class.java)
        startActivity(intent)
    }

    fun onClickBack(view: View) {
        val intent = Intent(this, StartActivity::class.java)
        startActivity(intent)
    }

}