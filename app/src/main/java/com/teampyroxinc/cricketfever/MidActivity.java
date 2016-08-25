package com.teampyroxinc.cricketfever;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MidActivity extends Activity {


    private Integer tot_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_mid);
        Bundle bundle = getIntent().getExtras();
        tot_score = bundle.getInt("Total Score");
        TextView textView = (TextView)findViewById(R.id.textView5);
        textView.setText(String.valueOf(tot_score));
    }
}
