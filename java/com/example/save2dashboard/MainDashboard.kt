package com.example.save2dashboard


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.save2dashboard.databinding.ActivityMainDashboardBinding

class MainDashboard : AppCompatActivity() {

    private lateinit var binding : ActivityMainDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Products())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){

                R.id.products -> replaceFragment(Products())
                R.id.stores -> replaceFragment(Stores())

                else ->{

                }
            }
            true
        }

        }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}