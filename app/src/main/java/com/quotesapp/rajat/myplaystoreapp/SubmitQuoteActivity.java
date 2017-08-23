package com.quotesapp.rajat.myplaystoreapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;

public class SubmitQuoteActivity extends BasicMenuActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView mobWebView=new WebView(SubmitQuoteActivity.this);
        mobWebView.getSettings().setJavaScriptEnabled(true);
        mobWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSc1T6QxukrIbo3ijqi7aVsIsaDH6vVDdGm-MDRnILTjQuezKA/viewform");

        setContentView(mobWebView);

    }
}
