package com.example.news.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.news.R;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        final String url = getIntent().getStringExtra("url");

        webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(url);
    }
}
