package com.example.cat1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameDisplay = findViewById<TextView>(R.id.name_display)
        val ageDisplay = findViewById<TextView>(R.id.age_display)

        // Retrieve data from the Intent
        val name = intent.getStringExtra("USER_NAME")
        val yearOfBirth = intent.getIntExtra("YEAR_OF_BIRTH", 0)

        // Calculate age
        val age = 2024 - yearOfBirth

        // Display data
        nameDisplay.text = "Name: $name"
        ageDisplay.text = "Age: $age"
    }
}
