package com.example.lnt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameEditText;
    public static String TAG=MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Activity Created");
        nameEditText=findViewById(R.id.editTextTextPersonName);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Activity Started");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Activity Stopped");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Activity Resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Activity Destroyed");
    }

    public void clickHandler(View view) {
        Log.i(TAG,"Button Clicked");
        int sum=add(10,20);
        //Toast.makeText(this, "Sum is: "+sum, Toast.LENGTH_SHORT).show();
        switch (view.getId())
        {
            case R.id.buttonlogin:
                Log.w(TAG,"logging in");
                String name=nameEditText.getText().toString();
               // Toast.makeText(this, "Welcome to android! "+name, Toast.LENGTH_SHORT).show();
                Intent homeIntent=new Intent(MainActivity.this,HomeActivity.class);
                homeIntent.putExtra("mykey",name);
                startActivity(homeIntent);
                break;
            case R.id.buttoncancel:
                Log.e(TAG,"cancelling");
                Intent dialIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7026873490"));
                startActivity(dialIntent);
               // Toast.makeText(this, "Cancelled ! ", Toast.LENGTH_SHORT).show();
                break;

        }

    }

    /**
     * This will add two numbers
     * @param n1
     * @param n2
     * @return
     */
    private int add(int n1,int n2)
    {
        return n1+n2;
    }
}