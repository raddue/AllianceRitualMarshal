package com.radaedalus.allianceritualmarshal

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)

        initFabMenu()
    }

    private fun initFabMenu() {

        val fabMain: View = findViewById<FloatingActionButton>(R.id.fab_main)
        fabMain.setOnClickListener {
            Toast.makeText(applicationContext, "Add slide out feature here", Toast.LENGTH_SHORT)
                .show()
        }

        val fabRoll: View = findViewById<FloatingActionButton>(R.id.fab_roll)
        fabRoll.setOnClickListener {
            DieRollerActivity.start(this)
            Toast.makeText(applicationContext, "Add roll feature here", Toast.LENGTH_SHORT)
                .show()
        }

        val fabTimer: View = findViewById<FloatingActionButton>(R.id.fab_timer)
        fabTimer.setOnClickListener {
            TimerActivity.start(this)
            Toast.makeText(applicationContext, "Add timer feature here", Toast.LENGTH_SHORT)
                .show()
        }

    fun openMenu() {

    }

    fun closeMenu() {

    }

    fun onClick() {

    }

    }
}
