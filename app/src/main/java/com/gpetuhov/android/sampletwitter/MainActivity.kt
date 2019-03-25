package com.gpetuhov.android.sampletwitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twitter.sdk.android.core.Callback
import com.twitter.sdk.android.core.TwitterException
import com.twitter.sdk.android.core.TwitterSession
import kotlinx.android.synthetic.main.activity_main.*

// Do not forget to initialize Twitter in Application onCreate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.callback = object : Callback<TwitterSession>() {
            override fun success(result: com.twitter.sdk.android.core.Result<TwitterSession>?) {
                // TODO
            }

            override fun failure(exception: TwitterException) {
                // TODO: Do something on failure
            }
        }
    }
}
