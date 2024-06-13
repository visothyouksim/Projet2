package com.example.projet_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var button: Button

    private lateinit var editTextLogin: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button

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

        editTextLogin = findViewById(R.id.editTextLogin)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.btnLogin)

        buttonLogin.setOnClickListener {
            val login = editTextLogin.text.toString()
            val password = editTextPassword.text.toString()

            if (login == "user" && password == "password") {
                val intent = Intent(this, PageTwo::class.java).apply {
                    putExtra("LOGIN", login)
                }
                startActivity(intent)
            } else {
                val intent = Intent(this, ErrorPage::class.java)
                startActivity(intent)
            }
        }
    }
}
