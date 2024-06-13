package com.example.projet_2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PageTwo : AppCompatActivity() {

    private lateinit var textView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_two)

//        println("ATTENTION PRINT")
//        println(intent.getIntExtra("id", 0))

        findViewById<Button>(R.id.btnPage3).setOnClickListener{
            val intentNextActivity : Intent = Intent(this, PageThree::class.java)
            startActivity(intentNextActivity)
        }

        textView = findViewById(R.id.textFromMain)
        val text = intent.getStringExtra("TEXT")
        textView.text = text

        val login = intent.getStringExtra("LOGIN")
        textView.text = "Bonjour, $login"
    }
}