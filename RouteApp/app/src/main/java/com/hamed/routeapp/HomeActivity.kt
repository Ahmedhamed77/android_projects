package com.hamed.routeapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_acitivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(v.paddingLeft, systemBars.top, v.paddingRight, systemBars.bottom)
            insets
        }


        val androidButton = findViewById<MaterialButton>(R.id.android_btn);
        val iosButton = findViewById<MaterialButton>(R.id.ios_btn);
        val fullStackButton = findViewById<MaterialButton>(R.id.fullStack_btn);

        androidButton.setOnClickListener {
            startCourseActivity(R.drawable.android_course_img, R.string.android_course_content)
        }

        iosButton.setOnClickListener {
            startCourseActivity(R.drawable.ios_course_img, R.string.ios_course_content)
        }

        fullStackButton.setOnClickListener {
            startCourseActivity(R.drawable.fullstack_course_img, R.string.fullStack_course_content)
        }
    }


    private fun startCourseActivity(courseImgResId: Int, courseTextResId: Int) {
        val intent = Intent(this, CourseActivity::class.java);

        intent.putExtra("course_img", courseImgResId);
        intent.putExtra("course_text", courseTextResId)

        startActivity(intent)
    }
}