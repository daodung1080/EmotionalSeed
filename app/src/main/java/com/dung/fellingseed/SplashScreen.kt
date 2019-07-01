package com.dung.fellingseed

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.dung.fellingseed.base.BaseActivity
import com.dung.fellingseed.loginsignup.LoginActivity

class SplashScreen : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        changeScreen()

    }

    fun setUpAnimation(){
        setAnimation(this)
    }

    fun changeScreen(){
        var handler = Handler()
        var runnable = Runnable {
            startActivity(Intent(this@SplashScreen, LoginActivity::class.java))
            this@SplashScreen.finish()
        }
        handler.postDelayed(runnable,3)
    }

}
