package com.spk.firstapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by karan on 5/31/2018.
 */

public class sample extends AppCompatActivity
{
    Button btnn;
    TextView objj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_layout);
        objj=(TextView) findViewById(R.id.karan_activity);
        btnn=(Button) findViewById(R.id.activity_button2);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sample.this,sample1.class);
                startActivity(intent);
            }
        });

    }
}
