package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_emotion_article.*
import kotlinx.android.synthetic.main.activity_support.*
import kotlinx.android.synthetic.main.activity_support.go_pr_p
import kotlinx.android.synthetic.main.activity_survey.*

class SupportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)
        ViewChildList()
        BackHomeFromSupport()
    }

    private fun ViewChildList() {
        go_child_listp.setOnClickListener {
            val intent = Intent(this, Childlist::class.java)
            startActivity(intent)
        }
    }

    private fun BackHomeFromSupport() {
        go_pr_p.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}