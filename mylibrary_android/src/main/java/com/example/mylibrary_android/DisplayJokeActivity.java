package com.example.mylibrary_android;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayJokeActivity extends AppCompatActivity {

    public final static String JOKE_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);
        TextView jokeTextView = findViewById(R.id.textView_joke);
        jokeTextView.setText(joke);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                return true;

            default:
                throw new RuntimeException("The item selected doesn't exist.");
        }

    }
}
