package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);


        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent male = new Intent(Dashboard.this,Maleworkout.class);
                male.putExtra("fullBody",R.drawable.male_fullbody);
                male.putExtra("arm",R.drawable.male_arm);
                male.putExtra("chest",R.drawable.male_chest);
                male.putExtra("abs",R.drawable.male_abs);
                male.putExtra("leg",R.drawable.male_leg);
                startActivity(male);
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent female = new Intent(Dashboard.this,Maleworkout.class);
                female.putExtra("fullBody",R.drawable.female_fullbody);
                female.putExtra("arm",R.drawable.female_arm);
                female.putExtra("chest",R.drawable.female_butt);
                female.putExtra("abs",R.drawable.female_abs);
                female.putExtra("leg",R.drawable.female_leg);
                startActivity(female);
            }
        });
    }

}