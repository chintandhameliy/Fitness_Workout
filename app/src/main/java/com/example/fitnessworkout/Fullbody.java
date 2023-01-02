package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class Fullbody extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Choiseclass> arrayList = new ArrayList();
    Button start;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullbody);
        start=findViewById(R.id.button);
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Fullbody.this,Maleworkout.class);
                startActivity(back);
                finish();
            }
        });

        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }


        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Choiseclass(R.raw.jumpingjacks,"JUMPING JACK","00:20",R.string.jumingjack));
        arrayList.add(new Choiseclass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X16",R.string.inclinepushup));
        arrayList.add(new Choiseclass(R.raw.kneepushups,"KNEE PUSH-UPS","X10",R.string.kneepushup));
        arrayList.add(new Choiseclass(R.raw.pushups,"PUSH-UPS","X8",R.string.pushup));
        arrayList.add(new Choiseclass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X8",R.string.widearmpushup));
        arrayList.add(new Choiseclass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X16",R.string.inclinepushup));
        arrayList.add(new Choiseclass(R.raw.kneepushups,"KNEE PUSH-UPS","X10",R.string.kneepushup));
        arrayList.add(new Choiseclass(R.raw.pushups,"PUSH-UPS","X8",R.string.pushup));
        arrayList.add(new Choiseclass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X8",R.string.widearmpushup));
        arrayList.add(new Choiseclass(R.raw.cobrastretch,"COBRA STRETCH","00:20",R.string.cobrastrecth));
        arrayList.add(new Choiseclass(R.raw.cheststretch,"CHEST STRETCH","00:20",R.string.cheststretch));

//        int [] resources={R.raw.jumpingjacks,R.raw.inclinepushups,R.raw.kneepushups,R.raw.pushups,R.raw.widearmpushups,R.raw.inclinepushups,R.raw.kneepushups,R.raw.pushups,R.raw.widearmpushups,R.raw.cobrastretch,R.raw.cheststretch};
//        String [] name={"JUMPING JACK","INCLINE PUSH-UPS","KNEE PUSH-UPS","PUSH-UPS","WIDE ARM PUSH-UPS","INCLINE PUSH-UPS","KNEE PUSH-UPS","PUSH-UPS","WIDE ARM PUSH-UPS","COBRA STRETCH","CHEST STRETCH"};
//        String [] duration={"00:20","X16","X10","X8","X8","X16","X10","X8","X8","00:20","00:20"};
//        ChoiseAdapter adapter = new ChoiseAdapter(this,arrayList);
//        recyclerView.setAdapter(adapter);
//        intent.putExtra("resources",resources);
//        intent.putExtra("name",name);
//        intent.putExtra("duration",duration);
//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(intent);
//            }
//        });


    }
}