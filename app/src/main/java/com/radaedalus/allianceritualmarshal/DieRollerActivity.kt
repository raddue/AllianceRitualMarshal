package com.radaedalus.allianceritualmarshal

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DieRollerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dieroller_main)

    }

    companion object {
        fun start(context : Context) {
            context.startActivity(Intent(context, DieRollerActivity::class.java))
        }
    }

}