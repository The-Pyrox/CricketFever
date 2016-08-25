package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class ChooseSide extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose_side);


    }



    public void bat_click(View view){
        Intent start = new Intent(this,Batting_First.class);

        startActivity(start);
    }

    public void bowl_click(View view){
        Intent start = new Intent(this,Bowling_First.class);

        startActivity(start);
    }
}
