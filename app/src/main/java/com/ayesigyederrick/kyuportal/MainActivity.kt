package com.ayesigyederrick.kyuportal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webview:WebView ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Kyu Portal"
        val webview = findViewById<WebView>(R.id.webview_id)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://myportal.kyu.ac.ug")
        val WebSettings = webview.settings
        WebSettings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        if(webview?.canGoBack() == true){
            webview.goBack()
        }
        super.onBackPressed()}
    }

