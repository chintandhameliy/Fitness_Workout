package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Chest extends AppCompatActivity {
    Button start;
    RecyclerView recyclerView;
    ArrayList<Choiseclass> arrayList = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        start=findViewById(R.id.start);
        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }
        Intent intent=new Intent(this,Exercise.class);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Choiseclass(R.raw.jumpingjacks,"JUMPING JACK","00:30",R.string.jumingjack));
        arrayList.add(new Choiseclass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X6",R.string.inclinepushup));
        arrayList.add(new Choiseclass(R.raw.pushups,"PUSH-UPS","X4",R.string.pushup));
        arrayList.add(new Choiseclass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X4",R.string.widearmpushup));
        arrayList.add(new Choiseclass(R.raw.tricepsdips,"TRICEPS DIPS","X6",R.string.tricepsdips));
        arrayList.add(new Choiseclass(R.raw.widearmpushups,"WIDE ARM PUSH-UPS","X4",R.string.widearmpushup));
        arrayList.add(new Choiseclass(R.raw.inclinepushups,"INCLINE PUSH-UPS","X4",R.string.inclinepushup));
        arrayList.add(new Choiseclass(R.raw.tricepsdips,"TRICEPS DIPS","X4",R.string.tricepsdips));
        arrayList.add(new Choiseclass(R.raw.kneepushups,"KNEE PUSH-UPS","X4",R.string.kneepushup));
        arrayList.add(new Choiseclass(R.raw.cobrastretch,"COBRA STRETCH","00:20",R.string.cobrastrecth));
        arrayList.add(new Choiseclass(R.raw.cheststretch,"CHEST STRETCH","00:20",R.string.cheststretch));

        int [] resources={ R.raw.jumpingjacks,
                R.raw.inclinepushups,
                R.raw.pushups,R.raw.widearmpushups,
                R.raw.tricepsdips,R.raw.widearmpushups,
                R.raw.inclinepushups,
                R.raw.tricepsdips,R.raw.kneepushups,
                R.raw.cobrastretch,
                R.raw.cheststretch};
        String [] name={"JUMPING JACK",
                "INCLINE PUSH-UPS","PUSH-UPS","WIDE ARM PUSH-UPS","TRICEPS DIPS","WIDE ARM PUSH-UPS","INCLINE PUSH-UPS","TRICEPS DIPS","KNEE PUSH-UPS","COBRA STRETCH",
                "CHEST STRETCH"};
        String [] duration={"00:30","X6","X4","X4","X6","X4","X4","X4","X4","00:20","00:20"};
        ChoiseAdapter adapter = new ChoiseAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);
        intent.putExtra("resources",resources);
        intent.putExtra("name",name);
        intent.putExtra("duration",duration);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
}