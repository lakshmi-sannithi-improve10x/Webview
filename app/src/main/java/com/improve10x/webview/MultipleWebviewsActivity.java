package com.improve10x.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class MultipleWebviewsActivity extends AppCompatActivity {
    Button googleBtn;
    WebView webWv;
    Button youtubeBtn;
    Button whatsappBtn;
    Button instagramBtn;
    Button facebookBtn;
    Button twitterBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_webviews);
        handleInitViews();
        handleGoogleBtn();
        handleYoutubeBtn();
    }

    public void handleInitViews(){
        googleBtn = findViewById(R.id.google_btn);
        webWv = findViewById(R.id.web_wv);
        youtubeBtn = findViewById(R.id.youtube_btn);
        whatsappBtn = findViewById(R.id.whatsapp_btn);
        instagramBtn = findViewById(R.id.instagram_btn);
        facebookBtn = findViewById(R.id.facebook_btn);
        twitterBtn = findViewById(R.id.twitter_btn);
    }

    public void  handleGoogleBtn(){
        googleBtn.setOnClickListener(view -> {
            webWv.loadUrl("https://www.google.com");
        });
    }

    public  void  handleYoutubeBtn(){
        youtubeBtn.setOnClickListener(view -> {
            webWv.loadUrl("https://www.youtube.com");
        });
    }
}