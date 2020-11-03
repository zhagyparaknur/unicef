package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emergency_call.*
import kotlinx.android.synthetic.main.activity_survey.*

class EmergencyCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency_call)
        setupViewsBackSurvey()
    }

    private fun setupViewsBackSurvey() {
        ok_call_emergency.setOnClickListener {
            val intent = Intent(this, SurveySecondActivity::class.java)
            startActivity(intent)
        }
    }
}