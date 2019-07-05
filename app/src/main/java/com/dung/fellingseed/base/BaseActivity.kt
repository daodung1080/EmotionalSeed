package com.dung.fellingseed.base

import android.app.Activity
import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.Toast
import com.dung.fellingseed.R

open class BaseActivity: AppCompatActivity() {

    fun showMessage(message: String){
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun setAnimation(activity: Activity){
        activity.overridePendingTransition(R.anim.anim_enter, R.anim.anim_exit)
    }

    fun replaceFragment(idLayout: Int, fragment: Fragment){
        if(fragment != null){
            supportFragmentManager.beginTransaction().replace(idLayout, fragment).commit()
        }
    }

    fun setActivityAnimation(context: Activity){
        context.overridePendingTransition(R.anim.animate_card_enter, R.anim.animate_card_exit);
    }

}