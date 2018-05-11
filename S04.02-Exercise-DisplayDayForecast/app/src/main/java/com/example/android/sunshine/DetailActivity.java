package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        String text = "No weather for you!";
        Intent launcherIntent = getIntent();

        if(launcherIntent.hasExtra(Intent.EXTRA_TEXT)) {
           text = launcherIntent.getStringExtra(Intent.EXTRA_TEXT);
        }
        // COMPLETE (2) Display the weather forecast that was passed from MainActivity
        ((TextView) findViewById(R.id.detail_activity_text)).setText(text);
    }
}