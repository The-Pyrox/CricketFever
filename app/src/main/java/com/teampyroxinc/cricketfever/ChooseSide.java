package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ChooseSide extends Activity {

    public boolean first_bat = false,first_bowl = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose_side);
    }

    public boolean isFirst_bowl() {
        return first_bowl;
    }

    public boolean isFirst_bat() {
        return first_bat;
    }

    public void bat_click(View view){
        Intent i = new Intent(this,Batting.class);
        first_bat = true;
        startActivity(i);
    }

    public void bowl_click(View view){
        Intent j = new Intent(this,Bowling.class);
        first_bowl = true;
        startActivity(j);
    }
}
