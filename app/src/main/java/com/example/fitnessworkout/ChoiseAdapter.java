package com.example.fitnessworkout;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.ColorSpace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;

public class ChoiseAdapter extends RecyclerView.Adapter<ChoiseAdapter.ViewHolder> {

    Context context;
    ArrayList<Choiseclass> arrlist;

    public  ChoiseAdapter(Context context,ArrayList<Choiseclass> arrlist)
    {
        this.context = context;
        this.arrlist = arrlist;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.choise,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.image.setAnimation(arrlist.get(position).image);
        holder.name.setText(arrlist.get(position).name);
        holder.time.setText(arrlist.get(position).time);
        setAnimation(holder.itemView,position);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder bulider = new AlertDialog.Builder(view.getRootView().getContext());
                View dialogView = LayoutInflater.from(view.getRootView().getContext()).inflate(R.layout.custom_dialog,null);
                LottieAnimationView armcirclesclickwise;
                TextView tv1,desc;

                armcirclesclickwise = dialogView.findViewById(R.id.armcirclesclickwise);
                tv1 = dialogView.findViewById(R.id.tv1);
                desc = dialogView.findViewById(R.id.desc);
                armcirclesclickwise.setAnimation(arrlist.get(position).getImage());
                tv1.setText(arrlist.get(position).getName());
                desc.setText(arrlist.get(position).getDesc());
                bulider.setView(dialogView);
                bulider.setCancelable(true);
                bulider.show();

            }
        });

    }

    private void setAnimation(View view,int position) {

        Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
        view.startAnimation(animation);
    }

    @Override
    public int getItemCount() {
        return arrlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,time;
        LottieAnimationView image;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            time = itemView.findViewById(R.id.time);
            image = itemView.findViewById(R.id.image);
            cardView = itemView.findViewById(R.id.cardView);
        }


    }


}
