package com.radaedalus.allianceritualmarshal

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DieRollerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dieroller_main)

        initFabMenu()
    }

    companion object {
        fun start(context : Context) {
            context.startActivity(Intent(context, DieRollerActivity::class.java))
        }
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

    }

}