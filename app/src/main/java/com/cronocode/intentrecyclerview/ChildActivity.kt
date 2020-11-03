package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_child.*

class ChildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child)
        setupViewshome()
    }

    private fun setupViewshome() {
        go_to_homepage.setOnClickListener {
            val intent = Intent(this, MyChildrenActivity::class.java)
            startActivity(intent)
        }
    }
}