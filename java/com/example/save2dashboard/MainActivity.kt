package com.example.save2dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_toDashboard = findViewById<Button>(R.id.btn_toDashboard)
        btn_toDashboard.setOnClickListener{
            val intentMainDB = Intent(this, MainDashboard::class.java)
            startActivity(intentMainDB)
        }

        var layout_toLoginPage = findViewById<LinearLayout>(R.id.layout_toLoginPage)
        layout_toLoginPage.setOnClickListener{
            val intentLoginPage = Intent(this, LoginPage::class.java)
            startActivity(intentLoginPage)
        }
    }

}