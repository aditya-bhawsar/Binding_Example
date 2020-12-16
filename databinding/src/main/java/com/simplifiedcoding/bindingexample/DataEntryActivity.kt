package com.simplifiedcoding.bindingexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.simplifiedcoding.bindingexample.databinding.ActivityDataEntryBinding

class DataEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityDataEntryBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_entry)

        binding.apply {
            goAheadBtn.setOnClickListener {
                val firstName = firstNameEt.text.toString()
                val lastName = lastNameEt.text.toString()
                val intent = Intent(this@DataEntryActivity, MainActivity::class.java)
                intent.putExtra("first",firstName)
                intent.putExtra("last",lastName)
                startActivity(intent)
            }
        }
    }
}