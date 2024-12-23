package com.example.mosqueinfo

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Mosques : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mosques)

        var c1 = findViewById<CardView>(R.id.cv1)
        var c2 = findViewById<CardView>(R.id.cv2)
        var c3 = findViewById<CardView>(R.id.cv3)
        c1.setOnClickListener{
            Toast.makeText(this, "Jama Masjid Shadab colony", Toast.LENGTH_SHORT).show()
            var intent= Intent(this, m1::class.java)
            startActivity(intent)
        }
        c2.setOnClickListener{
            Toast.makeText(this, "Masjid Alfarooq Vikas Nagar", Toast.LENGTH_SHORT).show()
            var intent= Intent(this, m2::class.java)
            startActivity(intent)
        }
        c3.setOnClickListener{
            Toast.makeText(this, "Rahim Nagar Masjid", Toast.LENGTH_SHORT).show()
            var intent= Intent(this, m3::class.java)
            startActivity(intent)
        }
    }
}