package com.dung.fellingseed.user

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dung.fellingseed.R
import com.dung.fellingseed.user.post.PostActivity
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceOnClickListener
import kotlinx.android.synthetic.main.activity_main_screen.*


class MainScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Set up bottom navigation
        setUpBottomNavigation()
        // Set click function for bottom navigation
        setUpClickFunction()

    }

    private fun setUpClickFunction() {
        bnMainScreen.setSpaceOnClickListener(object: SpaceOnClickListener{
            override fun onCentreButtonClick() {
                // Change Screen when click watering icon
                startActivity(Intent(this@MainScreenActivity, PostActivity::class.java))
            }

            override fun onItemReselected(itemIndex: Int, itemName: String?) {
            }

            override fun onItemClick(itemIndex: Int, itemName: String?) {
            }

        })
    }

    private fun setUpBottomNavigation() {
        // Create items for bottom navigation
        bnMainScreen.addSpaceItem(SpaceItem(resources.getString(R.string.menuMainScreenPlant), R.drawable.ic_plant))
        bnMainScreen.addSpaceItem(SpaceItem(resources.getString(R.string.menuMainScreenProfile), R.drawable.ic_profile))
    }
}
