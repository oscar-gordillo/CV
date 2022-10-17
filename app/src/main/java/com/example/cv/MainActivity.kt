package com.example.cv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.view.menu.MenuBuilder
import com.example.cv.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val myPageAdapter = MyPageAdapter(this)
        binding.vpager.adapter = myPageAdapter
        binding.tlayout.tabGravity = TabLayout.GRAVITY_FILL
        TabLayoutMediator(binding.tlayout,binding.vpager){tab,position->
            when(position){
                0->{
                    tab.text="Home"
                    tab.setIcon(R.drawable.home)
                }
                1->{
                    tab.text="About me"
                    tab.setIcon(R.drawable.ic_baseline_person_24)
                }
                2->{
                    tab.text="Work"
                    tab.setIcon(R.drawable.work)
                }
                3->{
                    tab.text = "Contact"
                    tab.setIcon(R.drawable.contact)
                }
            }
        }.attach()


    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        // Code to get the title and icon on the option overflow
        if (menu is MenuBuilder) {
            menu.setOptionalIconsVisible(true)
        }
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem):Boolean {
        Toast.makeText(
            applicationContext,
            item.title.toString(),
            Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}