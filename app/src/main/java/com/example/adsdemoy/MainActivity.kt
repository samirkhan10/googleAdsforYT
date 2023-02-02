package com.example.adsdemoy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {

    // on below line we are creating a
    // variable for ad view and ad request
    lateinit var adView: AdView
    lateinit var adRequest: AdRequest
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileAds.initialize(this)
        adView = findViewById(R.id.adView)
        adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)
    }

}
