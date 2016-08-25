package com.teampyroxinc.cricketfever;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MidActivity extends Activity {


    private Integer tot_score;
    private boolean side;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mid);
        Bundle bundle = getIntent().getExtras();
        tot_score = bundle.getInt("Total Score", 0);
        side = bundle.getBoolean("First Bat",false);
        TextView textView = (TextView) findViewById(R.id.display_target);
        textView.setText(String.valueOf(tot_score));

    }

    public void change_side(View view) {
        if (side == true) {
            Intent bowl = new Intent(this, Bowling.class);
            startActivity(bowl);
        }
        else{
            Intent bat = new Intent(this,Batting.class);
            startActivity(bat);
        }
    }
}

