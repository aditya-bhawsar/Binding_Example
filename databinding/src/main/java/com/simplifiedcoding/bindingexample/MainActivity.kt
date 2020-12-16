package com.simplifiedcoding.bindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.simplifiedcoding.bindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Here we set the view and then cast the instance we get via DataBindingUtil as the generated class
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Here we get the data sent in the previous activity
        //And check if it is null and replace with empty string if it is
        val firstName = intent.getStringExtra("first")?: ""
        val lastName = intent.getStringExtra("last")?: ""

        //Using a scope function to avoid writing binding again and again
        binding.apply {
            //Setting the value we got into a variable of layout
            name = Name(firstName,lastName)
            backBtn.setOnClickListener { finish() }
        }
    }
}