package com.rajbagri.recordkeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.rajbagri.recordkeeper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        replaceFragment(RunningFragment())

        binding.bottomNavButtons.setOnItemSelectedListener {

            when(it.itemId){
                R.id.nav_running -> replaceFragment(RunningFragment())
                R.id.nav_cycling -> replaceFragment(CyclingFragment())

                else -> {

                }

            }

            true
        }

    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_content, fragment)
        fragmentTransaction.commit()
    }



}

