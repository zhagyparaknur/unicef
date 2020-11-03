package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_personal_information.*

class PersonalInformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_information)
        childInformation()
    }

    private fun childInformation() {
        p_next_button.setOnClickListener {
            val intent = Intent(this, AddchildActivity::class.java)
            startActivity(intent)
        }
    }


}