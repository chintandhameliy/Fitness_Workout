package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Leg extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Choiseclass> arrayList = new ArrayList();
    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);
        start=findViewById(R.id.button);
        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }
        Intent intent=new Intent(this,Exercise.class);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Choiseclass(R.raw.sidehop,"SIDE HOP","00:30",R.string.sidehop));
        arrayList.add(new Choiseclass(R.raw.squats,"SQUATS","X12",R.string.squats));
        arrayList.add(new Choiseclass(R.raw.squats,"SQUATS","X12",R.string.squats));
        arrayList.add(new Choiseclass(R.raw.sidelyinglegliftleft,"SIDE-LYING LEG LIFT LEFT","X12",R.string.sidelayinglegliftleft));
        arrayList.add(new Choiseclass(R.raw.sidelyinglegliftright,"SIDE-LYING LEG LIFT RIGHT","X12",R.string.sidelayinglegliftright));
        arrayList.add(new Choiseclass(R.raw.sidelyinglegliftleft,"SIDE-LYING LEG LIFT LEFT","X12",R.string.sidelayinglegliftleft));
        arrayList.add(new Choiseclass(R.raw.kneepushups,"SIDE-LYING LEG LIFT RIGHT","X12",R.string.sidelayinglegliftright));
        arrayList.add(new Choiseclass(R.raw.backwardlunge,"BACKWARD LUNGE","X14",R.string.backwarglunge));
        arrayList.add(new Choiseclass(R.raw.backwardlunge,"BACKWARD LUNGE","X14",R.string.backwarglunge));
        arrayList.add(new Choiseclass(R.raw.donkeykickleft,"DONKEY KICK LEFT","X16",R.string.donkeykicksleft));
        arrayList.add(new Choiseclass(R.raw.donkeykicksright,"DONKEY KICK RIGHT","X16",R.string.donkeykicksright));
        arrayList.add(new Choiseclass(R.raw.donkeykickleft,"DONKEY KICK LEFT","X16",R.string.donkeykicksleft));
        arrayList.add(new Choiseclass(R.raw.donkeykicksright,"DONKEY KICK RIGHT","X16",R.string.donkeykicksright));
        int []resources={R.raw.sidehop,
                R.raw.squats,R.raw.squats,R.raw.sidelyinglegliftleft,
                R.raw.sidelyinglegliftright,
                R.raw.sidelyinglegliftleft,
                R.raw.kneepushups,
                R.raw.backwardlunge,
                R.raw.backwardlunge,
                R.raw.donkeykickleft,
                R.raw.donkeykicksright,
                R.raw.donkeykickleft,
                R.raw.donkeykicksright};
        String [] name={"SIDE HOP",
                "SQUATS","SQUATS","SIDE-LYING LEG LIFT LEFT","SIDE-LYING LEG LIFT RIGHT","SIDE-LYING LEG LIFT LEFT","SIDE-LYING LEG LIFT RIGHT","BACKWARD LUNGE","BACKWARD LUNGE","DONKEY KICK LEFT","DONKEY KICK RIGHT","DONKEY KICK LEFT","DONKEY KICK RIGHT"};
        String [] duration={"00:30", "X12", "X12", "X12", "X12", "X12", "X12", "X14", "X14", "X16", "X16", "X16", "X16"};


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