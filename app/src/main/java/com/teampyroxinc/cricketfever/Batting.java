package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.os.Vibrator;

import java.util.Random;

public class Batting extends Activity {
    public boolean isOut() {
        return out;
    }

    private Integer batcomp_score,batplayer_score,battotal_score=0,a=0;
    private boolean out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_batting);
    }

    public void batClick_1(View view){
        display_batcompscore();
        display_batplayerscore(1);
        check_wicket(batplayer_score,batcomp_score);
        display_score(1);
    }

    public void batClick_2(View view){
        display_batcompscore();
        display_batplayerscore(2);
        check_wicket(batplayer_score,batcomp_score);
        display_score(2);
    }

    public void batClick_3(View view){
        display_batcompscore();
        display_batplayerscore(3);
        check_wicket(batplayer_score,batcomp_score);
        display_score(3);
    }
    public void batClick_4(View view){
        display_batcompscore();
        display_batplayerscore(4);
        check_wicket(batplayer_score,batcomp_score);
        display_score(4);
    }
    public void batClick_5(View view){
        display_batcompscore();
        display_batplayerscore(5);
        check_wicket(batplayer_score,batcomp_score);
        display_score(5);
    }
    public void batClick_6(View view){
        display_batcompscore();
        display_batplayerscore(6);
        check_wicket(batplayer_score,batcomp_score);
        display_score(6);
    }
    public void batClick_10(View view){
        display_batcompscore();
        display_batplayerscore(10);
        check_wicket(batplayer_score,batcomp_score);
        if (isOut()){
            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(1000);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent i = new Intent(this,MidActivity.class);
            startActivity(i);
        }
        display_score(10);
    }
    public void batClick_exit(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);


    }

    public void display_batcompscore(){
        Random random = new Random();
        do {
            a = random.nextInt(11);
        }while(a ==0 || a==7 || a==8 || a == 9);
        batcomp_score = a;
        TextView textView1 = (TextView)findViewById(R.id.batcomp_score);
        textView1.setText(String.valueOf(a));
    }

    public void display_batplayerscore(int x){
        batplayer_score = x;
        TextView textView = (TextView)findViewById(R.id.batplayer_score);
        textView.setText(String.valueOf(x));

    }

    public void display_score(int button_clicked){
        battotal_score = battotal_score+ button_clicked;
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));

    }

    private void check_wicket(int p,int q){
        if (p==q){
            out = true;
        }
    }

}
