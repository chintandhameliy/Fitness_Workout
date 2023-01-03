package com.example.fitnessworkout;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class Exercise extends AppCompatActivity {
    CountDownTimer countDownTimer;
Button start,next,previous,reset;
TextView textView,exeName;
LottieAnimationView image;
int index=0;
long milli;
String [] duration;
    String [] name;
    int [] resources;
    Boolean now=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        start=findViewById(R.id.pause);
        next=findViewById(R.id.next);
        previous=findViewById(R.id.previous);
        reset=findViewById(R.id.reset);
        image=findViewById(R.id.image);
        textView=findViewById(R.id.textView);
        exeName=findViewById(R.id.exeName);
        Intent intent=getIntent();
       resources=intent.getIntArrayExtra("resources");
         name=intent.getStringArrayExtra("name");
        duration=intent.getStringArrayExtra("duration");
        image.setAnimation(resources[index]);
        exeName.setText(name[index]);
        textView.setText(duration[index]);
        previous.setVisibility(View.INVISIBLE);
        start.setVisibility(View.INVISIBLE);
        reset.setVisibility(View.INVISIBLE);
checking(index);
next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        index++;
        start.setText("START");
        checking(index);
        exeName.setText(name[index]);
        image.setAnimation(resources[index]);
        textView.setText(duration[index]);
        previous.setVisibility(View.VISIBLE);
        if (index==duration.length-1){
            next.setVisibility(View.INVISIBLE);
        }
    }
});
previous.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        index--;
        start.setText("START");
       checking(index);
        exeName.setText(name[index]);
        image.setAnimation(resources[index]);

        textView.setText(duration[index]);
        next.setVisibility(View.VISIBLE);
        if (index==0){
            previous.setVisibility(View.INVISIBLE);
        }
    }
});
    }
    public void checking(int a){
        if (!duration[a].startsWith("X")){
            start.setVisibility(View.VISIBLE);

            milli=Long.parseLong(duration[a].substring(3,5))*1000;
            textView.setText(duration[a]);
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reset.setVisibility(View.INVISIBLE);

                    if(now) {
                        countDownTimer=new CountDownTimer(milli, 1000) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                textView.setText(String.format("00:%02d",(millisUntilFinished/1000)%60));
                                milli=millisUntilFinished;
                            }

                            @Override
                            public void onFinish() {
                                start.setText("START");
                                reset.setVisibility(View.INVISIBLE);
                                textView.setText(duration[a]);
                                milli=Long.parseLong(duration[a].substring(3,5))*1000;
                                now=true;
                            }
                        };

                        countDownTimer.start();
                        now=false;
                        start.setText("PAUSE");
                    }
                    else {
                        reset.setVisibility(View.VISIBLE);
                        start.setText("START");
                        textView.setText(String.format("00:%02d",(milli/1000)%60));

                        countDownTimer.cancel();
                        now=true;

                    }


                }
            });
            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText(duration[a]);
                    milli=Long.parseLong(duration[a].substring(3,5))*1000;
                    start.setText("START");
                    reset.setVisibility(View.INVISIBLE);

                }
            });

        }
       else if (duration[a].startsWith("X")){
           countDownTimer.cancel();
           start.setVisibility(View.INVISIBLE);
           reset.setVisibility(View.INVISIBLE);


        }

    }

}