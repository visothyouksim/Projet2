package com.example.projet_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnPage2).setOnClickListener{
            val intentNextActivity = Intent(this, PageTwo::class.java)
            startActivity(intentNextActivity)
        }

        editText = findViewById(R.id.editText)
        button = findViewById(R.id.btnSaveText)

        button.setOnClickListener {
            val text = editText.text.toString()
            val intent = Intent(this, PageTwo::class.java).apply {
                putExtra("TEXT", text)
            }
            startActivity(intent)
        }
    }
}
