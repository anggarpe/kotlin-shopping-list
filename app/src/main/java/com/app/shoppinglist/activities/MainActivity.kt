package com.app.shoppinglist.activities

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.app.shoppinglist.R
import com.app.shoppinglist.fragments.CreateFragment
import com.app.shoppinglist.fragments.EmptyStateFragment
import com.app.shoppinglist.fragments.ListFragment
import com.app.shoppinglist.models.ItemShop
import com.enigmacamp.shoppinglist.ShoppingListViewAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = intent.getStringExtra(LoginActivity.USER_NAME)
        tvNameDashboard.text = name

//        tabLayout.addTab(tabLayout.newTab().setText("Create"))
//        tabLayout.addTab(tabLayout.newTab().setText("List"))
//        tabLayout.tabGravity = TabLayout.GRAVITY_FILL

        val buttonaddItemMenu = findViewById<ImageButton>(R.id.addItemMenu_button)
        buttonaddItemMenu.setOnClickListener {
            replaceFragment(CreateFragment.newInstance())
        }

        val buttonViewListMenu = findViewById<ImageButton>(R.id.viewListMenu_button)
        buttonViewListMenu.setOnClickListener {
            showFragment(shoppingListItem.size)
        }

        showFragment(shoppingListItem.size)
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }

    fun emptyFragment(size: Int) {
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, EmptyStateFragment.newInstance()).commit()
    }

    fun showFragment(size: Int) {
        if (size > 0) replaceFragment(ListFragment.newInstance())
        else emptyFragment(size)
    }


    companion object {
        var shoppingListItem = ArrayList<ItemShop>()
    }
}