package com.example.mosqueinfo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class Intro3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intro3)

        var btn = findViewById<MaterialButton>(R.id.btn_i3)
        btn.setOnClickListener{
            Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show()
            var intent= Intent(this, Mosques::class.java)
            startActivity(intent)
        }
    }
}