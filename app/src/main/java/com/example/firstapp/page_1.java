package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class page_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_1);

        final Intent intent5 = new Intent(this, page_3.class);


        final ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton2);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    Toast.makeText(getApplicationContext(), "Toggle is ON!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Toggle is OFF!", Toast.LENGTH_SHORT).show();
                }
            }
        });




        final Button page3 = (Button) findViewById(R.id.button4);
        page3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent5);
            }
        });

        Button toast = (Button) findViewById(R.id.button1);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Toggle Button OFF!", Toast.LENGTH_SHORT).show();
            }
        });

        View backbutton = (Button) findViewById(R.id.button2);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "I'm back!", Toast.LENGTH_SHORT).show();
                finish();

            }
        });


        final ConstraintLayout constrait11 = (ConstraintLayout) findViewById(R.id.constrait1);

        final RadioButton radio_red = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton radio_yellow = (RadioButton) findViewById(R.id.radioButton2);
        radio_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constrait11.setBackgroundColor(Color.RED);
            }
        });
        radio_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constrait11.setBackgroundColor(Color.YELLOW);
            }
        });


        final Button toastbut =  (Button) findViewById(R.id.button1);
        toastbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radio_red.isChecked()){
                    Toast.makeText(getApplicationContext(), "Background is RED!", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Background is Yellow!", Toast.LENGTH_SHORT).show();
                }

            }
        });




        final TextView text = (TextView) findViewById(R.id.textView8);
        final CheckBox check1 = (CheckBox) findViewById(R.id.checkBox);
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(check1.isChecked())
                {
                text.setTextSize(25);
            } else {
                    text.setTextSize(15);
                }
        }

        });
    }
}
