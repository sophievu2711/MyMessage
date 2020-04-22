package com.example.mymessenger;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class NewActivity extends AppCompatActivity {
    public static final String NEW_MESSAGE = "This is new activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String newMessage = intent.getStringExtra(NEW_MESSAGE);

        TextView newMessageView = (TextView)findViewById(R.id.newActivity);
        newMessageView.setText(newMessage);
    }
}
