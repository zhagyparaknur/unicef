package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setupViewstwo()
    }

    private fun setupViewstwo() {
        sign_in_button.setOnClickListener {
            val intent = Intent(this, PersonalInformationActivity::class.java)
            startActivity(intent)
        }
    }
}