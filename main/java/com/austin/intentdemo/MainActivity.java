package com.austin.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    public static final int code = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bkg = (Button) findViewById(R.id.setbkg);
        bkg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                startActivityForResult(i, code);
            }
        });
    }
    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode == code && resultCode == Activity.RESULT_OK){
            Bundle bundle = data.getExtras();
            if (bundle != null){
                int bkg = bundle.getInt("bkg");
                LinearLayout layout = findViewById(R.id.activitymain);
                layout.setBackground(getDrawable(bkg));
            }
        }
    }
}
