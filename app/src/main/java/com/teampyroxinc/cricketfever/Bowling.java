package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Random;

public class Bowling extends Activity {
    
    private Integer comp_score,bowltotal_score=0,a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_bowling);
    }
    public void bowlClick_1(View view){
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(1));
        comp_score = display_compscore();
        bowltotal_score = display_score(comp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));


    }

    public void bowlClick_2(View view){
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(2));
        comp_score = display_compscore();
        bowltotal_score = display_score(comp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));


    }

    public void bowlClick_3(View view){
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(3));
        comp_score = display_compscore();
        bowltotal_score = display_score(comp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));


    }
    public void bowlClick_4(View view){
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(4));
        comp_score = display_compscore();
        bowltotal_score = display_score(comp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));

    }
    public void bowlClick_5(View view){
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(5));
        comp_score = display_compscore();
        bowltotal_score = display_score(comp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));


    }
    public void bowlClick_6(View view){
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(6));
        comp_score = display_compscore();
        bowltotal_score = display_score(comp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));


    }
    public void bowlClick_10(View view){
        TextView textView = (TextView)findViewById(R.id.bowlplayer_score);
        textView.setText(String.valueOf(10));
        comp_score = display_compscore();
        bowltotal_score = display_score(comp_score);
        TextView textView1 = (TextView)findViewById(R.id.bowlcomp_score);
        textView1.setText(String.valueOf(comp_score));
        TextView textView2 = (TextView)findViewById(R.id.bowltotal_score);
        textView2.setText(String.valueOf(bowltotal_score));

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
        bowltotal_score = bowltotal_score+ button_clicked;
        return bowltotal_score;
    }
}
