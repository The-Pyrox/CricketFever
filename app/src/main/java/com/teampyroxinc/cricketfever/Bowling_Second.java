package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class Bowling_Second extends Activity {
    private Integer bowlcomp_score,bowlplayer_score,bowltotal_score=0,a=0,target;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bowling__second);
        Bundle bowl_bundle = getIntent().getExtras();
        target = bowl_bundle.getInt("Target",0);
        TextView textView = (TextView)findViewById(R.id.target);
        textView.setText(String.valueOf(target));

    }
    public void bowlclick_1(View view){
        display_bowlcompscore();
        display_bowlplayerscore(1);
        check_wicket(bowlcomp_score,bowlplayer_score);


    }

    public void bowlclick_2(View view){
        display_bowlcompscore();
        display_bowlplayerscore(2);
        check_wicket(bowlcomp_score,bowlplayer_score);

    }

    public void bowlclick_3(View view){
        display_bowlcompscore();
        display_bowlplayerscore(3);
        check_wicket(bowlcomp_score,bowlplayer_score);


    }
    public void bowlclick_4(View view){
        display_bowlcompscore();
        display_bowlplayerscore(4);
        check_wicket(bowlcomp_score,bowlplayer_score);
    }
    public void bowlclick_5(View view){
        display_bowlcompscore();
        display_bowlplayerscore(5);
        check_wicket(bowlcomp_score,bowlplayer_score);

    }
    public void bowlclick_6(View view){
        display_bowlcompscore();
        display_bowlplayerscore(6);
        check_wicket(bowlcomp_score,bowlplayer_score);

    }
    public void bowlclick_10(View view){
        display_bowlcompscore();
        display_bowlplayerscore(10);
        check_wicket(bowlcomp_score,bowlplayer_score);
    }
    public void batClick_exit(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);


    }

    public void display_bowlcompscore(){
        Random random = new Random();
        do {
            a = random.nextInt(11);
        }while(a ==0 || a==7 || a==8 || a == 9);
        bowlcomp_score = a;
        TextView textView1 = (TextView)findViewById(R.id.bowlComp_score);
        textView1.setText(String.valueOf(a));
    }

    public void display_bowlplayerscore(int x){
        bowlplayer_score = x;
        TextView textView = (TextView)findViewById(R.id.bowlPlayer_score);
        textView.setText(String.valueOf(bowlplayer_score));


    }

    public void display_score(int button_clicked){
        bowltotal_score = bowltotal_score+ button_clicked;
        TextView textView2 = (TextView)findViewById(R.id.bowlTotal_score);
        textView2.setText(String.valueOf(bowltotal_score));

    }
    private void check_wicket(int p,int q){
        if (p==q){

            Bundle bundle = new Bundle();
            bundle.putInt("Player", bowltotal_score);
            bundle.putInt("Android",target);
            if (bowltotal_score>target)
                bundle.putBoolean("Result",true);
            else
                bundle.putBoolean("Result",false);
            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            v.vibrate(1000);
            for (int j = 0; j < 99999999; j++) ;
            Intent bowl = new Intent(this, EndActivity.class);
            bowl.putExtras(bundle);
            startActivity(bowl);

        }
        else{
            display_score(p);
        }
    }
}


