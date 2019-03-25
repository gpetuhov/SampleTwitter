package com.gpetuhov.android.sampletwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Do not forget to initialize Twitter in Application onCreate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
