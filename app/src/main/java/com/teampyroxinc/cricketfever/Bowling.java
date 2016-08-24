package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class Bowling extends Activity {
    
    private Integer bowlcomp_score,bowlplayer_score,bowltotal_score=0,a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_bowling);
    }
    public void bowlClick_1(View view){
        bowlplayer_score = 1;
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(bowlplayer_score));
        bowlcomp_score = display_compscore();
        bowltotal_score = display_score(bowlcomp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(bowlcomp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));
        check_wicket(bowlcomp_score,bowlplayer_score);


    }

    public void bowlClick_2(View view){
        bowlplayer_score = 2;
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(bowlplayer_score));
        bowlcomp_score = display_compscore();
        bowltotal_score = display_score(bowlcomp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(bowlcomp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));
        check_wicket(bowlcomp_score,bowlplayer_score);

    }

    public void bowlClick_3(View view){
        bowlplayer_score = 3;
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(bowlplayer_score));
        bowlcomp_score = display_compscore();
        bowltotal_score = display_score(bowlcomp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(bowlcomp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));
        check_wicket(bowlcomp_score,bowlplayer_score);


    }
    public void bowlClick_4(View view){
        bowlplayer_score = 4;
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(bowlplayer_score));
        bowlcomp_score = display_compscore();
        bowltotal_score = display_score(bowlcomp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(bowlcomp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));
        check_wicket(bowlcomp_score,bowlplayer_score);
    }
    public void bowlClick_5(View view){
        bowlplayer_score = 5;
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(bowlplayer_score));
        bowlcomp_score = display_compscore();
        bowltotal_score = display_score(bowlcomp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(bowlcomp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));
        check_wicket(bowlcomp_score,bowlplayer_score);

    }
    public void bowlClick_6(View view){
        bowlplayer_score = 6;
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(bowlplayer_score));
        bowlcomp_score = display_compscore();
        bowltotal_score = display_score(bowlcomp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(bowlcomp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));
        check_wicket(bowlcomp_score,bowlplayer_score);

    }
    public void bowlClick_10(View view){
        bowlplayer_score = 10;
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(bowlplayer_score));
        bowlcomp_score = display_compscore();
        bowltotal_score = display_score(bowlcomp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(bowlcomp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));
        check_wicket(bowlcomp_score,bowlplayer_score);
    }
    public void batClick_exit(){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);


    }

    public int display_compscore(){
        Random random = new Random();
        do {
            a = random.nextInt(11);
        }while(a ==0 || a==7 || a==8 || a == 9);
        return a;

    }

    public int display_score(int button_clicked){
        bowltotal_score = bowltotal_score+ button_clicked;
        return bowltotal_score;
    }
    private void check_wicket(int p,int q){
        if (p==q){
            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(1000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent i = new Intent(this,MidActivity.class);
            startActivity(i);
        }
    }
}
