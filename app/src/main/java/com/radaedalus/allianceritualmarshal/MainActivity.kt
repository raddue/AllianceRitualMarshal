package com.radaedalus.allianceritualmarshal

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)

        val fab: View = findViewById(R.id.fab_main)
        fab.setOnClickListener {
            Toast.makeText(applicationContext, "Add countdown and roll features here", Toast.LENGTH_LONG)
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