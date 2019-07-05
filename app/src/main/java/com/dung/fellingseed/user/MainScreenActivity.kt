package com.dung.fellingseed.user

import android.content.Intent
import android.os.Bundle
import com.dung.fellingseed.R
import com.dung.fellingseed.base.BaseActivity
import com.dung.fellingseed.user.fragment.PlantsFragment
import com.dung.fellingseed.user.fragment.ProfileFragment
import com.dung.fellingseed.user.post.PostActivity
import com.luseen.spacenavigation.SpaceItem
import com.luseen.spacenavigation.SpaceOnClickListener
import kotlinx.android.synthetic.main.activity_main_screen.*


class MainScreenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Spawn first fragment
        replaceFragment(R.id.flMainScreen, PlantsFragment())
        // Set up bottom navigation
        setUpBottomNavigation()
        // Set click function for bottom navigation
        setUpClickFunction()

    }

    private fun setUpClickFunction() {
        bnMainScreen.setSpaceOnClickListener(object : SpaceOnClickListener {
            override fun onCentreButtonClick() {
                // Change Screen when click watering icon
                startActivity(Intent(this@MainScreenActivity, PostActivity::class.java))
            }

            override fun onItemReselected(itemIndex: Int, itemName: String?) {
            }

            override fun onItemClick(itemIndex: Int, itemName: String?) {
                if (itemIndex == 0) {
                    replaceFragment(R.id.flMainScreen, PlantsFragment())
                }
                else if (itemIndex == 1) {
                    replaceFragment(R.id.flMainScreen, ProfileFragment())
                }
            }

        })
    }

    private fun setUpBottomNavigation() {
        // Create items for bottom navigation
        bnMainScreen.addSpaceItem(SpaceItem(resources.getString(R.string.menuMainScreenPlant), R.drawable.ic_plant))
        bnMainScreen.addSpaceItem(SpaceItem(resources.getString(R.string.menuMainScreenProfile), R.drawable.ic_profile))
    }
}
