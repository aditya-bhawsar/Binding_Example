package com.simplifiedcoding.bindingexampleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simplifiedcoding.bindingexampleview.databinding.ActivityDataEntryBinding
import com.simplifiedcoding.bindingexampleview.databinding.ActivityMainBinding

class DataEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDataEntryBinding.inflate(layoutInflater)
        setContentView(binding.root)

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