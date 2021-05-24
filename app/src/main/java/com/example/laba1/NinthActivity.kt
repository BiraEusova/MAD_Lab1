package com.example.laba1
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.burger.*

class NinthActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.burger)

        supportFragmentManager.beginTransaction().replace(R.id.boxForBurgerFragment,
            BurgerInstructionActivity()).commit()

        ingredients.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.boxForBurgerFragment,
                BurgerInstructionActivity()).commit()
        }
        instruction.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.boxForBurgerFragment,
                BurgerIngredientsActivity()).commit()
        }
        backImageButton.setOnClickListener {
            onBackPressed()
        }
        }
}