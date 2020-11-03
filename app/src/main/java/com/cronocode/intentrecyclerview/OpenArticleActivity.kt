package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.cronocode.intentrecyclerview.database.Image
import com.cronocode.intentrecyclerview.database.OpenBlog
import kotlinx.android.synthetic.main.activity_open_article.*
import kotlinx.android.synthetic.main.activity_open_blog.*
import kotlinx.android.synthetic.main.open_blog_recycle_activity.*

class OpenArticleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_article)
        setupViewsHome()


        val blog = intent.getParcelableExtra<OpenBlog>(OpenBlogActivity.INTENT_PARCELABLE)
        val blogSrc = findViewById<ImageView>(R.id.blog_image)
        val blogTitle = findViewById<TextView>(R.id.blog_title)
        val blogDescription = findViewById<TextView>(R.id.blog_description)

        blogSrc.setImageResource(blog.open_blogSrc)
        blogTitle.text = blog.open_blogTitle
        blogDescription.text = blog.open_blogDesc

    }

    private fun setupViewsHome() {
        go_block_p.setOnClickListener {
            val intent = Intent(this, OpenBlogActivity::class.java)
            startActivity(intent)

        }
    }
}