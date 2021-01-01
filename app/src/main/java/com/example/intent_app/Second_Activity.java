package com.example.intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);
        t=findViewById(R.id.textView);
        Intent i=getIntent();
        String value=i.getStringExtra("key");
        t.setText(value);
    }
}