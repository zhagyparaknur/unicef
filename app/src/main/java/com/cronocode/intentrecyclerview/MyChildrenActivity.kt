package com.cronocode.intentrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cronocode.intentrecyclerview.adapter.ChildAdapter
import com.cronocode.intentrecyclerview.database.Child
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_children_recycler_view.*


class MyChildrenActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

//    private fun setupViewstoHomeone() {
//        my_child_button.setOnClickListener {
//            val intent = Intent(this, HomeActivity::class.java)
//            startActivity(intent)
//        }
//    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.my_children_recycler_view)
//        setupViewstoHomeone()



        val childList = listOf<Child>(
            Child(
                R.drawable.baby,
                R.drawable.hrec10,
                "Название",
                "Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста"
            ),

            Child(
                R.drawable.baby,
                R.drawable.hrec10,
                "Название",
                "Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста"
            ),

            Child(
                R.drawable.baby,
                R.drawable.hrec10,
                "Название",
                "Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста"
            ),

            Child(
                R.drawable.baby,
                R.drawable.hrec10,
                "Название",
                "Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста"
            ),

            Child(
                R.drawable.baby,
                R.drawable.hrec10,
                "Название",
                "Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста Кусок текста"
            )
        )



        val recyclerView = findViewById<RecyclerView>(R.id._childRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter =
            ChildAdapter(
                this,
                childList
            ) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE, it)
                startActivity(intent)
            }
    }
}