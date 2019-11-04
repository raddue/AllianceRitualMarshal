package com.radaedalus.allianceritualmarshal

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var fab_main: FloatingActionButton
    private lateinit var fab_timer: FloatingActionButton
    private lateinit var fab_roll: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        toolbar = findViewById(R.id.toolbar) as Toolbar
        fab_main = findViewById(R.id.fab_main)
        fab_roll = findViewById(R.id.fab_roll)
        fab_timer = findViewById(R.id.fab_timer)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
    }

//    fun initFabMenu() {
//        fab_timer.setAlpha(0f)
//        fab_roll.setAlpha(0f)
//
//
//        val fabMain: View = findViewById(R.id.fab_main)
//        fabMain.setOnClickListener {
//            Toast.makeText(applicationContext, "Add slide out feature here", Toast.LENGTH_LONG)
//                .show()
//        }
//
//        val fabRoll: View = findViewById(R.id.fab_roll)
//        fabRoll.setOnClickListener {
//            Toast.makeText(applicationContext, "Add roll feature here", Toast.LENGTH_LONG)
//                .show()
//        }
//
//        val fabTimer: View = findViewById(R.id.fab_timer)
//        fabTimer.setOnClickListener {
//            Toast.makeText(applicationContext, "Add timer feature here", Toast.LENGTH_LONG)
//                .show()
//        }
//    }

    fun openMenu() {

    }

    fun closeMenu() {

    }

    fun onClick() {

    }
}