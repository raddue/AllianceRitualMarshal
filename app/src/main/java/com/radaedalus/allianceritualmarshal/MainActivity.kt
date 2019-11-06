package com.radaedalus.allianceritualmarshal

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)

        // Add the navigation drawer toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Add the hamburger menu button
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }

        // Initialize the FAB menu
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
        }

        val fabTimer: View = findViewById<FloatingActionButton>(R.id.fab_timer)
        fabTimer.setOnClickListener {
            TimerActivity.start(this)
        }

    fun openMenu() {

    }

    fun closeMenu() {

    }

    fun onClick() {

    }

    }
}
