package com.dung.fellingseed.base

import android.support.v4.app.Fragment
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation

open class BaseFragment: Fragment() {

    // Set up animation for screen
    fun setLayoutAnimation(viewToAnimate: View){
        val anim = ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f,
            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f)
        anim.duration = 500
        viewToAnimate.startAnimation(anim)
    }

}