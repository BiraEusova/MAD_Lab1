package com.example.laba1

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.botnav.*

class BottomNavigation: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.botnav)
        botnav.setOnNavigationItemSelectedListener(navListener)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
                FourthActivity()).commit()
        }
    }
    private val navListener: BottomNavigationView.OnNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.mainBottom -> selectedFragment = FourthActivity()
                R.id.searchBottom -> selectedFragment = SixthActivity()
                R.id.favoriteBottom -> selectedFragment = FifthActivity()
                R.id.settingBottom -> selectedFragment = EighthActivity()
            }
            supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
                selectedFragment!!).commit()
            true
        }

    fun onClickSearch(view: View?) {
        supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
            SeventhActivity()!!).commit()
    }

    fun onClickBack7(view: View?) {
        supportFragmentManager.beginTransaction().replace(R.id.boxForFragments,
            SixthActivity()!!).commit()
    }

    fun onClickMeat(view: View) {
        val intent = Intent(this, NinthActivity::class.java)
        startActivity(intent)
    }

}
