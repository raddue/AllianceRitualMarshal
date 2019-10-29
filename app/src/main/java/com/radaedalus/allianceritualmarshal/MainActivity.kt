package com.radaedalus.allianceritualmarshal

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val translationY = 100f
    val translationX = 100f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
        initFabMenu()
    }

    fun initFabMenu() {
        fab_timer.setAlpha(0f)
        fab_roll.setAlpha(0f)


        val fabMain: View = findViewById(R.id.fab_main)
        fabMain.setOnClickListener {
            Toast.makeText(applicationContext, "Add slide out feature here", Toast.LENGTH_LONG)
                .show()
        }

        val fabRoll: View = findViewById(R.id.fab_roll)
        fabRoll.setOnClickListener {
            Toast.makeText(applicationContext, "Add roll feature here", Toast.LENGTH_LONG)
                .show()
        }

        val fabTimer: View = findViewById(R.id.fab_timer)
        fabTimer.setOnClickListener {
            Toast.makeText(applicationContext, "Add timer feature here", Toast.LENGTH_LONG)
                .show()
        }
    }

    fun openMenu() {

    }

    fun closeMenu() {

    }

    fun onClick() {

    }
}