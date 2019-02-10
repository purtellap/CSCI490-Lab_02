package com.austin.intentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView img1 = (ImageView) findViewById(R.id.imageView);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = R.drawable.supermoon;
                finish();
            }
        });
        ImageView img2 = (ImageView) findViewById(R.id.imageView2);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = R.drawable.waterfall;
                finish();
            }
        });
    }
    @Override
    public void finish() {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.putExtra("bkg", id);
        setResult(RESULT_OK, i);
        super.finish();

    }
}
