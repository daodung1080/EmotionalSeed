package com.dung.fellingseed.base

import android.app.Activity
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
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

}