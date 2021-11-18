package com.example.myfinalprojectmayu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
private const val LAST_SELECTED_ITEM ="View"

class MainActivity : AppCompatActivity() {



    private lateinit var bottomNavigationMenu: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationMenu = findViewById(R.id.bot_navig_menu)
        bottomNavigationMenu.setOnItemSelectedListener { item ->

            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.number -> {
                    fragment = NumberFragment()

                }
                R.id.time_year -> {
                    fragment = SeasonFragment()
                }
                R.id.work -> {
                    fragment = WorkFragment()
                }
            }
            replaceFragment(fragment!!)// совершаем замену

            true
        }
        bottomNavigationMenu.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM)?:R.id.number

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM,bottomNavigationMenu.selectedItemId)
        super.onSaveInstanceState(outState)

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

}