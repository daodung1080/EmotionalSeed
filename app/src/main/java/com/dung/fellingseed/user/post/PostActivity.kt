package com.dung.fellingseed.user.post

import android.os.Bundle
import com.dung.fellingseed.R
import com.dung.fellingseed.base.BaseActivity
import kotlinx.android.synthetic.main.activity_sign_up.*

class PostActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        setSupportActionBar(toolbar)

        // Create toolbar with new back button
        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_back)
    }
}
