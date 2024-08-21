package com.hamed.facebooktimeline

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hamed.facebooktimeline.adapter.SocialPostAdapter
import com.hamed.facebooktimeline.data.DummyPostsData
import com.hamed.facebooktimeline.model.SocialPost


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // recyclerView content
        val recyclerView = findViewById<RecyclerView>(R.id.socialTimeLineRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        // posts
        recyclerView.adapter = SocialPostAdapter(DummyPostsData.posts)
    }
}