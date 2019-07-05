package com.dung.fellingseed.user.fragment

import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import com.dung.fellingseed.R
import com.dung.fellingseed.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_main_screen_profile.view.*

class ProfileFragment : BaseFragment() {

    lateinit var rootView: View
    lateinit var llProfile: LinearLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_main_screen_profile, container, false)

        initView()
        setLayoutAnimation(llProfile)

        return rootView
    }

    private fun initView() {
        llProfile = rootView.llProfile
    }

}