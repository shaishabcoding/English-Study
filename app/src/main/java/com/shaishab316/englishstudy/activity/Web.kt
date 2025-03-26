package com.shaishab316.englishstudy.activity

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuItemCompat
import com.shaishab316.englishstudy.R
import com.shaishab316.englishstudy.get
import com.shaishab316.englishstudy.toast


class Web : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web).apply {
            webView = loadWebView(
                findViewById(R.id.webView)
            )
        }
        supportActionBar?.apply {
            (intent get "title").let {
                if (it != "") {
                    title = it
                }
            }
            setDisplayHomeAsUpEnabled(true)
        }
    }

    @SuppressLint("SetJavaScriptEnabled")
    fun loadWebView(
        webView: WebView,
    ) = webView.apply {
        settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            databaseEnabled = true
            addJavascriptInterface(JsInterface(applicationContext), "App")

            builtInZoomControls = true
            displayZoomControls = false
        }
        webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                webView.visibility = View.VISIBLE
                super.onPageFinished(view, url)
            }
        }
        webChromeClient = WebChromeClient()

        //load an url
        loadUrl((intent.get("url") + intent.get("title")))
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.search_menu, menu)
        @Suppress("DEPRECATION") (MenuItemCompat.getActionView(menu.findItem(R.id.bar_search)) as SearchView).apply {
            setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    webView.findAll(newText)
                    return false
                }
            })
        }
        return true
    }

}

class JsInterface(
    private val context: Context,
) {
    @JavascriptInterface
    fun toast(message: String) = message toast context
}