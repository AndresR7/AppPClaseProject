package com.andrescastellanos.appproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    private ImageView iv_refactor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        iv_refactor = findViewById(R.id.iv_refactor);

        iv_refactor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}