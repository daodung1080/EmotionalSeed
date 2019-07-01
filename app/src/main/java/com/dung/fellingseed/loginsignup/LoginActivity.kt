package com.dung.fellingseed.loginsignup

import android.content.Intent
import android.os.Bundle
import com.dung.fellingseed.R
import com.dung.fellingseed.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Change to sign up screen
        changeToSignUpScreen()

    }

    private fun changeToSignUpScreen() {
        tvLoginSignUp.setOnClickListener {
            startActivity(Intent(this@LoginActivity,SignUpActivity::class.java))
        }
    }
}
