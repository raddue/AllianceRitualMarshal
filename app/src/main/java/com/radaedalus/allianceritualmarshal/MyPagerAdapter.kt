package com.radaedalus.allianceritualmarshal

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.radaedalus.allianceritualmarshal.ui.main.BeforeCastFragment
import com.radaedalus.allianceritualmarshal.ui.main.RitualManipsFragment
import com.radaedalus.allianceritualmarshal.ui.main.DuringCastFragment
import com.radaedalus.allianceritualmarshal.ui.main.AfterCastFragment

@Suppress("DEPRECATION")
class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                BeforeCastFragment()
            }
            1 -> {
                DuringCastFragment()
            }
            2 -> AfterCastFragment()
            else -> {
                return RitualManipsFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): String {
        return when (position) {
            0 -> "Before Casting"
            1 -> "During Casting"
            2 -> "After Casting"
            else -> {
                return "Ritual\nManipulations"
            }
        }
    }
}