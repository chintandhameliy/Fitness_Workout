package com.example.fitnessworkout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class Abs extends AppCompatActivity {
Button start;
    RecyclerView recyclerView;
    ArrayList<Choiseclass> arrayList = new ArrayList();
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs);
        start=findViewById(R.id.button);

        back = findViewById(R.id.back);
        Intent image = getIntent();
        int fullBody=image.getIntExtra("fullBody",0);
        int arm=image.getIntExtra("arm",0);
        int leg=image.getIntExtra("leg",0);
        int abs=image.getIntExtra("abs",0);
        int chest=image.getIntExtra("chest",0);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Abs.this,Maleworkout.class);
                back.putExtra("fullBody",fullBody);
                back.putExtra("arm",arm);
                back.putExtra("abs",abs);
                back.putExtra("chest",chest);
                back.putExtra("leg",leg);
                startActivity(back);
                finish();
            }
        });
        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }
        Intent intent=new Intent(this,Exercise.class);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Choiseclass(R.raw.jumpingjacks,"JUMPING JACK","00:20",R.string.jumingjack));
        arrayList.add(new Choiseclass(R.raw.abdominalcrunches,"ABODOMINAL CRUNCHES","X16",R.string.abodominalcrunches));
        arrayList.add(new Choiseclass(R.raw.russiantwist,"RUSSIAN TWIST","X20",R.string.russiantwist));
        arrayList.add(new Choiseclass(R.raw.mountainclimber,"MOUNTAIN CLIMBER","X16",R.string.mountainclimber));
        arrayList.add(new Choiseclass(R.raw.heeltouch,"HEEL TOUCH","X20",R.string.heeltouch));
        arrayList.add(new Choiseclass(R.raw.legraises,"LEG RAISES","X16",R.string.plank));
        arrayList.add(new Choiseclass(R.raw.plank,"PLANK","00:20",R.string.armraises));
        arrayList.add(new Choiseclass(R.raw.abdominalcrunches,"ABODOMINAL CRUNCHES","X12",R.string.abodominalcrunches));
        arrayList.add(new Choiseclass(R.raw.russiantwist,"RUSSIAN TWIST","X32",R.string.russiantwist));
        arrayList.add(new Choiseclass(R.raw.mountainclimber,"MOUNTAIN CLIMBER","X12",R.string.mountainclimber));
        arrayList.add(new Choiseclass(R.raw.heeltouch,"HEEL TOUCH","X20",R.string.heeltouch));
        arrayList.add(new Choiseclass(R.raw.legraises,"LEG RAISES","X14",R.string.legraises));
        arrayList.add(new Choiseclass(R.raw.plank,"PLANK","00:30",R.string.plank));
        arrayList.add(new Choiseclass(R.raw.cobrastretch,"COBRA STRETCH","00:30",R.string.cobrastrecth));
        arrayList.add(new Choiseclass(R.raw.spinelumbartwiststretchleleft,"SPINE LUMBER TWIST STRETCH LEFT","00:30",R.string.spinelumbertwiststretchleft));
        arrayList.add(new Choiseclass(R.raw.spinelumbartwiststretchleright,"SPINE LUMBER TWIST STRETCH RIGHT","00:30",R.string.spinelumbertwiststretchright));

        int [] resources={R.raw.jumpingjacks,R.raw.abdominalcrunches,R.raw.russiantwist,R.raw.mountainclimber,R.raw.heeltouch,R.raw.legraises,R.raw.plank,R.raw.abdominalcrunches,R.raw.russiantwist,R.raw.mountainclimber,R.raw.heeltouch,R.raw.legraises,R.raw.plank,R.raw.cobrastretch,R.raw.spinelumbartwiststretchleleft,R.raw.spinelumbartwiststretchleright};
        String [] name={"JUMPING JACK","ABODOMINAL CRUNCHES","RUSSIAN TWIST","MOUNTAIN CLIMBER","HEEL TOUCH","LEG RAISES","PLANK","ABODOMINAL CRUNCHES","RUSSIAN TWIST","MOUNTAIN CLIMBER","HEEL TOUCH","LEG RAISES","PLANK","COBRA STRETCH","SPINE LUMBER TWIST STRETCH LEFT","SPINE LUMBER TWIST STRETCH RIGHT"};
        String [] duration={"00:20","X16","X20","X16","X20","X16","00:20","X12","X32","X12","X20","X14","00:30","00:30","00:30","00:30"};



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