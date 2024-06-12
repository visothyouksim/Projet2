package com.example.projet_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PageTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_two)

        findViewById<Button>(R.id.btnPage3).setOnClickListener{
            val intentNextActivity : Intent = Intent(this, PageThree::class.java)
            startActivity(intentNextActivity)
        }
    }
}