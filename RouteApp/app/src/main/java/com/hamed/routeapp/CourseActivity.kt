package com.hamed.routeapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CourseActivity : AppCompatActivity() {


    private lateinit var courseImage: ImageView;
    private lateinit var courseText: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_course)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(v.paddingLeft, v.top, v.paddingRight, systemBars.bottom)
            insets
        }


        findViews();

        bindData()
    }


    private fun findViews() {
        courseImage = findViewById(R.id.course_img);
        courseText = findViewById(R.id.course_text);
    }

    private fun bindData() {
        val courseImageResData = intent.getIntExtra("course_img", -1);
        val courseTextContent = intent.getIntExtra("course_text", -1);

        courseImage.setImageResource(courseImageResData);
        courseText.setText(courseTextContent)
    }
}