package com.example.projet_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnPage2).setOnClickListener{
            val intentNextActivity : Intent = Intent(this, PageTwo::class.java)
            startActivity(intentNextActivity)
        }
    }
}