package com.example.save2dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        var btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener{
            val intentShopAccout = Intent(this, ShopAccount::class.java)
            startActivity(intentShopAccout)
        }

        var to_SignUpPage = findViewById<TextView>(R.id.to_SignUpPage)
        to_SignUpPage.setOnClickListener{
            val intentRegisterShop = Intent(this, RegisterShop::class.java)
            startActivity(intentRegisterShop)
        }

    }
}