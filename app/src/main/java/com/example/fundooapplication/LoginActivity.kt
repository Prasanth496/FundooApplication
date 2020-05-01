package com.example.fundooapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var  mTextEmail : EditText
    lateinit var mTextPassword: EditText
    lateinit var mButtonLogin : Button
    lateinit var mTextViewRegister : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mTextEmail = findViewById(R.id.edittext_email)
        mTextPassword = findViewById(R.id.edittext_password)
        mButtonLogin = findViewById(R.id.button_login)
        mTextViewRegister = findViewById(R.id.textview_register)

    }
}
