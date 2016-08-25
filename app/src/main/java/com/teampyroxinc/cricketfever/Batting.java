package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.os.Vibrator;

import java.util.Random;

public class Batting extends Activity {


    public Integer batcomp_score,batplayer_score,a=0;

    public Integer battotal_score=0;



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

    }

    public void batClick_2(View view){
        display_batcompscore();
        display_batplayerscore(2);
        check_wicket(batplayer_score,batcomp_score);

    }

    public void batClick_3(View view){
        display_batcompscore();
        display_batplayerscore(3);
        check_wicket(batplayer_score,batcomp_score);

    }
    public void batClick_4(View view){
        display_batcompscore();
        display_batplayerscore(4);
        check_wicket(batplayer_score,batcomp_score);

    }
    public void batClick_5(View view){
        display_batcompscore();
        display_batplayerscore(5);
        check_wicket(batplayer_score,batcomp_score);

    }
    public void batClick_6(View view){
        display_batcompscore();
        display_batplayerscore(6);
        check_wicket(batplayer_score,batcomp_score);

    }
    public void batClick_10(View view){
        display_batcompscore();
        display_batplayerscore(10);
        check_wicket(batplayer_score,batcomp_score);

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
        textView.setText(String.valueOf(batplayer_score));

    }

    public void display_score(int button_clicked){
        battotal_score = battotal_score+ button_clicked;
        TextView textView2 = (TextView)findViewById(R.id.battotal_score);
        textView2.setText(String.valueOf(battotal_score));

    }

    private void check_wicket(int p,int q){
        if (p==q){
            Bundle bundle = new Bundle();
            bundle.putInt("Total Score",battotal_score);
            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(1000);
            for (int j= 0;j<99999999;j++);
            Intent i = new Intent(this,MidActivity.class);
            i.putExtras(bundle);
            startActivity(i);
        }
        else {
            display_score(p);
        }
    }

}
