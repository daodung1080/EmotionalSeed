package com.dung.fellingseed.user.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dung.fellingseed.R
import com.dung.fellingseed.base.BaseFragment

class PlantsFragment : BaseFragment() {

    lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_main_screen_plants, container, false)
        return rootView
    }

}