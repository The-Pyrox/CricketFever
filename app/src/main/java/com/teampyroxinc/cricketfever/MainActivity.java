package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }
    public void single_click(View view){
        Intent i = new Intent(this,ChooseSide.class);
        startActivity(i);
    }

    public void multi_click(View view){
        Intent i = new Intent(this,SearchPeers.class);
        startActivity(i);

    }
}
