package com.example.save2dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterShop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_shop)

        var btn_registerAcc = findViewById<Button>(R.id.btn_registerAcc)
        btn_registerAcc.setOnClickListener{
            val intentShopAccount = Intent(this, ShopAccount::class.java)
            startActivity(intentShopAccount)
        }
    }
}