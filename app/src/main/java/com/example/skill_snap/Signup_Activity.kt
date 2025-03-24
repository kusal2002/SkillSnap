package com.example.skill_snap

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Signup_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val next2 = findViewById<Button>(R.id.signin)
        next2.setOnClickListener{
            val intent2 = Intent (this, MainActivity::class.java)
            startActivity(intent2)
        }

        val signin = findViewById<TextView>(R.id.already_have_account)
        signin.setOnClickListener{
            val intent2 = Intent (this, Login_Activity::class.java)
            startActivity(intent2)
        }

    }
}