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

public class Arm extends AppCompatActivity {
Button start;
    RecyclerView recyclerView;
    ArrayList<Choiseclass> arrayList = new ArrayList();
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm);
        start=findViewById(R.id.button);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Arm.this,Maleworkout.class);
                startActivity(back);
                finish();
            }
        });
        if(getActionBar()!= null)
        {
            getActionBar().hide();
        }
        //Intent intent=new Intent(this,Exercise.class);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        arrayList.add(new Choiseclass(R.raw.armrises,"ARM RAISES","00:30",R.string.armraises));
        arrayList.add(new Choiseclass(R.raw.sidearmraises,"SIDE ARM RAISE","00:30",R.string.sidearmraises));
        arrayList.add(new Choiseclass(R.raw.tricepsdips,"TRICEPS DIPS","X10",R.string.tricepsdips));
        arrayList.add(new Choiseclass(R.raw.armcirclesclickwise,"ARM CIRCLES CLOCKWISE","00:30",R.string.armcirclesclickwise));
        arrayList.add(new Choiseclass(R.raw.armcirclescounterclickwise,"ARM CIRCLES COUNTERCLOCKWISE","00:30",R.string.armcirclescounterclickwise));
        arrayList.add(new Choiseclass(R.raw.diamondpushups,"DIAMOND PUSH-UPS","X6",R.string.diamondpushups));
        arrayList.add(new Choiseclass(R.raw.jumpingjacks,"JUMPING JACK","00:30",R.string.jumingjack));
        arrayList.add(new Choiseclass(R.raw.chestpresspulse,"CHEST PRESS PULSE","00:16",R.string.chestpresspulse));
        arrayList.add(new Choiseclass(R.raw.legbrbellcurlleft,"LEG BARBELL CURL LEFT","X8",R.string.legbrbellcurlleft));
        arrayList.add(new Choiseclass(R.raw.legbrbellcurlright,"LEG BARBELL CURL RIGHT","X8",R.string.legbrbellcurlright));
        arrayList.add(new Choiseclass(R.raw.diagonalplank,"DIAGONAL PLANK","X10",R.string.diagonalplank));
        arrayList.add(new Choiseclass(R.raw.punches,"PUNCHES","00:30",R.string.punches));
        arrayList.add(new Choiseclass(R.raw.pushups,"PUSH-UPS","X10",R.string.pushup));
        arrayList.add(new Choiseclass(R.raw.inchworms,"INCHWORMS","X8",R.string.inchworms));
        arrayList.add(new Choiseclass(R.raw.wallpushups,"WALL PUSH-UPS","X12",R.string.wallpushups));
        arrayList.add(new Choiseclass(R.raw.tricepsstretchleft,"TRICEPS STRETCH LEFT","00:30",R.string.tricepsstretchleft));
        arrayList.add(new Choiseclass(R.raw.tricepsstretchright,"TRICEPS STRETCH RIGHT","00:30",R.string.tricepsstretchright));
        arrayList.add(new Choiseclass(R.raw.standingbicepsstretchleft,"STANDING BICEPS STRETCH LEFT","00:30",R.string.standingbicepsstretchleft));
        arrayList.add(new Choiseclass(R.raw.standingbicepsstretchright,"STANDING BICEPS STRETCH RIGHT","00:30",R.string.standingbicepsstretchright));
        String [] duration={"00:30","00:30","X10","00:30","00:30","X6","00:30","00:16","X8","X8","X10","00:30","X10","X8","X12","00:30","00:30","00:30","00:30"};
        String [] name={"ARM RAISES","SIDE ARM RAISE","TRICEPS DIPS","ARM CIRCLES CLOCKWISE","ARM CIRCLES COUNTERCLOCKWISE","DIAMOND PUSH-UPS","JUMPING JACK","CHEST PRESS PULSE","LEG BARBELL CURL LEFT","LEG BARBELL CURL RIGHT","DIAGONAL PLANK","PUNCHES","PUSH-UPS","INCHWORMS","WALL PUSH-UPS","TRICEPS STRETCH LEFT","TRICEPS STRETCH RIGHT","STANDING BICEPS STRETCH LEFT","STANDING BICEPS STRETCH RIGHT"};
        int [] resources={R.raw.armrises,R.raw.sidearmraises,R.raw.tricepsdips,R.raw.armcirclesclickwise,R.raw.armcirclescounterclickwise,R.raw.diamondpushups,R.raw.jumpingjacks,R.raw.chestpresspulse,R.raw.legbrbellcurlleft,R.raw.legbrbellcurlright,R.raw.diagonalplank,R.raw.punches,R.raw.inchworms,R.raw.wallpushups,R.raw.tricepsstretchleft,R.raw.tricepsstretchright,R.raw.standingbicepsstretchleft,R.raw.standingbicepsstretchright};


        ChoiseAdapter adapter = new ChoiseAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);
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