package com.gpetuhov.android.sampletwitter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pawegio.kandroid.toast
import com.twitter.sdk.android.core.Callback
import com.twitter.sdk.android.core.TwitterException
import com.twitter.sdk.android.core.TwitterSession
import kotlinx.android.synthetic.main.activity_main.*
import com.twitter.sdk.android.core.TwitterCore
import com.twitter.sdk.android.core.identity.TwitterAuthClient


// Do not forget to initialize Twitter in Application onCreate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initName()
        initMail()

        loginButton.callback = object : Callback<TwitterSession>() {
            override fun success(result: com.twitter.sdk.android.core.Result<TwitterSession>?) {
                toast("Login success")
                userName.text = result?.data?.userName ?: ""
                initMail()
            }

            override fun failure(exception: TwitterException) {
                toast("Login fail")
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Pass the activity result to the login button.
        loginButton.onActivityResult(requestCode, resultCode, data)
    }

    // Here we get user name from active Twitter session (if logged in)
    private fun initName() {
        val session = TwitterCore.getInstance().sessionManager.activeSession
        userName.text = session?.userName ?: ""
    }

    // Here we get current user's mail
    private fun initMail() {
        val session = TwitterCore.getInstance().sessionManager.activeSession

        if (session != null) {
            val authClient = TwitterAuthClient()
            authClient.requestEmail(session, object : Callback<String>() {
                override fun success(result: com.twitter.sdk.android.core.Result<String>?) {
                    userMail.text = result?.data ?: ""
                }

                override fun failure(exception: TwitterException) {
                    toast("Error getting mail")
                }
            })
        }
    }
}
