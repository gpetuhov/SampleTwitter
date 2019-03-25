# SampleTwitter
Using Twitter SDK in Android.

## Requirements
* Android Studio 3.5 Canary 7
* Kotlin 1.3.30-eap-45
* Android Gradle Plugin 3.5.0-alpha07
* Gradle wrapper 5.2.1
* AAPT 2

## Notes
* This example uses Twitter Kit SDK, support for which has been discontinued: https://blog.twitter.com/developer/en_us/topics/tools/2018/discontinuing-support-for-twitter-kit-sdk.html
* To use Twitter SDK we have to apply for a Twitter developer account first
* When registering new app using Twitter Kit SDK, set callback URL to: twittersdk://
* Place Twitter consumer key and secret in ~/.gradle/gradle.properties file and use them as string resources as described here: https://medium.com/code-better/hiding-api-keys-from-your-android-repository-b23f5598b906

## References
https://developer.twitter.com/en/docs/publisher-tools/twitterkit/overview

https://github.com/twitter/twitter-kit-android