package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splachscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splachscreen);


        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splach = new Intent(Splachscreen.this,Dashboard.class);
                startActivity(splach);
                finish();
            }
        },3000);
    }

}