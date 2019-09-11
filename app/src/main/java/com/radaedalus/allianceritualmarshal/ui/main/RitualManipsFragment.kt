package com.radaedalus.allianceritualmarshal.ui.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.radaedalus.allianceritualmarshal.R

/**
 * A simple [Fragment] subclass.
 */
class RitualManipsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rit_manips, container, false)
    }


}
