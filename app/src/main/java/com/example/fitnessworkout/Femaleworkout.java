package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Femaleworkout extends AppCompatActivity {

    CardView fullbody,arm,abs,butt,leg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_femaleworkout);

        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }

        fullbody = findViewById(R.id.fullbody);
        arm = findViewById(R.id.arm);
        abs =findViewById(R.id.abs);
        butt = findViewById(R.id.butt);
        leg = findViewById(R.id.leg);
        fullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fullbody = new Intent(Femaleworkout.this, Fullbody.class);
                startActivity(fullbody);
                finish();
            }
        });

        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leg = new Intent(Femaleworkout.this, Leg.class);
                startActivity(leg);
                finish();
            }
        });

        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arm = new Intent(Femaleworkout.this, Arm.class);
                startActivity(arm);
                finish();
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abs = new Intent(Femaleworkout.this, Abs.class);
                startActivity(abs);
                finish();
            }
        });

        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent butt = new Intent(Femaleworkout.this, Chest.class);
                startActivity(butt);
                finish();
            }
        });
    }
}