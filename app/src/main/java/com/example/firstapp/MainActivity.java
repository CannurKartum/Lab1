package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intent1 = new Intent(this, page_1.class);
        final Intent intent2 = new Intent(this, page_2.class);
        final Intent intent3 = new Intent(this, page_3.class);

        Button goToPage1 = (Button) findViewById(R.id.goToPage1);
        goToPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

        Button goToPage2 = (Button) findViewById(R.id.goToPage2);
        goToPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });

        Button goToPage3 = (Button) findViewById(R.id.goToPage3);
        goToPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent3);
            }
        });


    }
}