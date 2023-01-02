package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Maleshowdata extends AppCompatActivity {
    TextView name,desc;
    LottieAnimationView animation;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maleshowdata);

        name = findViewById(R.id.name);
        desc = findViewById(R.id.desc);
        animation = findViewById(R.id.animation);
        back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back  = new Intent(Maleshowdata.this,Maleworkout.class);
                startActivity(back);
                finish();
            }
        });

        Intent card = getIntent();
        name.setText(card.getStringExtra("Name"));
        desc.setText(card.getIntExtra("Description",0));
        animation.setAnimation(card.getIntExtra("Animation",0));

    }
}