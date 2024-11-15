package com.example.cat1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.name_input)
        val yearInput = findViewById<EditText>(R.id.year_input)
        val submitButton = findViewById<Button>(R.id.submit_button)

        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val year = yearInput.text.toString()

            if (name.isNotEmpty() && year.isNotEmpty()) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("USER_NAME", name)
                intent.putExtra("YEAR_OF_BIRTH", year.toInt())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
