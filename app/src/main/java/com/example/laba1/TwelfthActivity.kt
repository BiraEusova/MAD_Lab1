package com.example.laba1

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class TwelfthActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.twelfth)
    }

    fun onClickPass(view: View){
        val resetPasswordFragment = DialogKlass()
        val manager = supportFragmentManager
        resetPasswordFragment.show(manager,"resetPasswordFragment")
    }


    fun onClickBack12(view: View) {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}