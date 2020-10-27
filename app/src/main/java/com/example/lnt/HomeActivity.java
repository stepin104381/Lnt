package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    public static String TAG=HomeActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"Activity created");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String data=getIntent().getExtras().getString("mykey");
        TextView greetingTextView=findViewById(R.id.textView_greeting);
        greetingTextView.setText(data);

    }
}