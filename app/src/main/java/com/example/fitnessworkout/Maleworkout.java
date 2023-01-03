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
        int fullBodyR=setImages.getIntExtra("fullBody",0);
        int armR=setImages.getIntExtra("arm",0);
        int chestR=setImages.getIntExtra("chest",0);
        int legR=setImages.getIntExtra("leg",0);
        int absR=setImages.getIntExtra("abs",0);
        fullbody.setBackgroundResource(fullBodyR);
        arm.setBackgroundResource(armR);
        chest.setBackgroundResource(chestR);
        leg.setBackgroundResource(legR);
        abs.setBackgroundResource(absR);
        fullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fullbody = new Intent(Maleworkout.this, Fullbody.class);
                fullbody.putExtra("fullBody",fullBodyR);
                fullbody.putExtra("arm",armR);
                fullbody.putExtra("chest",chestR);
                fullbody.putExtra("leg",legR);
                fullbody.putExtra("abs",absR);
                startActivity(fullbody);
                finish();
            }
        });

        arm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent arm = new Intent(Maleworkout.this, Arm.class);
                arm.putExtra("fullBody",fullBodyR);
                arm.putExtra("arm",armR);
                arm.putExtra("chest",chestR);
                arm.putExtra("leg",legR);
                arm.putExtra("abs",absR);
                startActivity(arm);
                finish();
            }
        });

        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abs = new Intent(Maleworkout.this, Abs.class);
                abs.putExtra("fullBody",fullBodyR);
                abs.putExtra("chest",chestR);
                abs.putExtra("abs",absR);
                startActivity(abs);
                finish();
            }
        });

        chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chest = new Intent(Maleworkout.this, Chest.class);
                chest.putExtra("fullBody",fullBodyR);
                chest.putExtra("arm",armR);
                chest.putExtra("chest",chestR);
                chest.putExtra("leg",legR);
                chest.putExtra("abs",absR);
                startActivity(chest);
                finish();
            }
        });

        leg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leg = new Intent(Maleworkout.this, Leg.class);
                leg.putExtra("fullBody",fullBodyR);
                leg.putExtra("arm",armR);
                leg.putExtra("chest",chestR);
                leg.putExtra("leg",legR);
                leg.putExtra("abs",absR);
                startActivity(leg);
                finish();
            }
        });
    }
}