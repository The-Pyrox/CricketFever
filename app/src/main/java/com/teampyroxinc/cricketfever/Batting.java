package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class Batting extends Activity {


    public Integer comp_score,battotal_score=0,a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_batting);
    }

    public void batClick_1(View view){
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(1));
        comp_score = display_compscore();
        battotal_score = display_score(1);
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));


    }

    public void batClick_2(View view){
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(2));
        comp_score = display_compscore();
        battotal_score = display_score(2);
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));


    }

    public void batClick_3(View view){
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(3));
        comp_score = display_compscore();
        battotal_score = display_score(3);
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));


    }
    public void batClick_4(View view){
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(4));
        comp_score = display_compscore();
        battotal_score = display_score(4);
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));

    }
    public void batClick_5(View view){
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(5));
        comp_score = display_compscore();
        battotal_score = display_score(5);
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));


    }
    public void batClick_6(View view){
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(6));
        comp_score = display_compscore();
        battotal_score = display_score(6);
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));


    }
    public void batClick_10(View view){
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(10));
        comp_score = display_compscore();
        battotal_score = display_score(10);
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));

    }
    public void batClick_exit(){

    }

    public int display_compscore(){
        Random random = new Random();
        do {
            a = random.nextInt(11);
        }while(a ==0 || a==7 || a==8 || a == 9);
        return a;

    }

    public int display_score(int button_clicked){
        battotal_score = battotal_score+ button_clicked;
        return battotal_score;
    }
}
