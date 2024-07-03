package com.hamed.authgate

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen


// TODO: show content over keyboard
// TODO: make input lose focus when the keyboard closes so the input reset its animation

class MainActivity : AppCompatActivity() {


    private lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //  get Button by viewId
        loginBtn = findViewById(R.id.login_button)

        // how to get longPress
        // run animation until the user release the press
        loginBtn.setOnClickListener(View.OnClickListener { v ->
            // Scale up the button to 0.9x its size over 200 milliseconds
          scaleButtonAnimation(v)
        })
    }
}


fun scaleButtonAnimation(btnView: View) {
    btnView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(200).withEndAction {
        btnView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200)
    }
}