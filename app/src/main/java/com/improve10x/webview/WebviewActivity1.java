package com.improve10x.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);
        WebView webviewwv = findViewById(R.id.webview_wv);
        webviewwv.loadUrl("file:///android_asset/myresource.html");
    }
}