package com.simplifiedcoding.bindingexampleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simplifiedcoding.bindingexampleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Here we use generated class for binding to inflate the layout and then pass it to set as the view
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Here we get the data sent in the previous activity
        //And check if it is null and replace with empty string if it is
        val firstName = intent.getStringExtra("first")?:""
        val lastName = intent.getStringExtra("last")?:""

        //Using a scope function to avoid writing binding again and again
        binding.apply {
            //Setting Name on the textViews
            firstNameTv.text = firstName
            lastNameTv.text = lastName
            //BackBtn click is set to finish this activity
            backBtn.setOnClickListener { finish() }
        }
    }
}