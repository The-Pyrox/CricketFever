package com.teampyroxinc.cricketfever;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class EndActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_end);
        Bundle bundle = getIntent().getExtras();
        TextView textView = (TextView)findViewById(R.id.android_score);
        TextView textView1 = (TextView)findViewById(R.id.player_score);
        textView.setText(String.valueOf(bundle.getInt("Android")));
        textView1.setText(String.valueOf(bundle.getInt("Player")));
        if (bundle.getBoolean("Result")==true){
            TextView textView2 = (TextView)findViewById(R.id.result);
            textView2.setText("You Win!");
        }
        else{
            TextView textView3 = (TextView)findViewById(R.id.result);
            textView3.setText("You lose!");
        }
    }
}
