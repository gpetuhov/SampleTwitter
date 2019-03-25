package com.gpetuhov.android.sampletwitter

import android.app.Application
import com.twitter.sdk.android.core.Twitter

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Twitter.initialize(this)
    }
}