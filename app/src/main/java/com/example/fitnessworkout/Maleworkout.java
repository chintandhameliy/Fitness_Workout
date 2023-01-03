package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Maleworkout extends AppCompatActivity {

    CardView fullbody,arm,abs,chest,leg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maleworkout);

        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }

        fullbody = findViewById(R.id.fullbody);
        arm = findViewById(R.id.arm);
        abs = findViewById(R.id.abs);
        chest = findViewById(R.id.chest);
        leg = findViewById(R.id.leg);
        Intent setImages=getIntent();

        fullbody.setBackgroundResource(setImages.getIntExtra("fullBody",0));
        arm.setBackgroundResource(setImages.getIntExtra("arm",0));
        chest.setBackgroundResource(setImages.getIntExtra("chest",0));
        leg.setBackgroundResource(setImages.getIntExtra("leg",0));
        abs.setBackgroundResource(setImages.getIntExtra("abs",0));
        fullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fullbody = new Intent(Maleworkout.this, Fullbody.class);
                startActivity(fullbody);
                finish();
            }
        });

        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arm = new Intent(Maleworkout.this, Arm.class);
                startActivity(arm);
                finish();
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abs = new Intent(Maleworkout.this, Abs.class);
                startActivity(abs);
                finish();
            }
        });

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chest = new Intent(Maleworkout.this, Chest.class);
                startActivity(chest);
                finish();
            }
        });

        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leg = new Intent(Maleworkout.this, Leg.class);
                startActivity(leg);
                finish();
            }
        });
    }
}