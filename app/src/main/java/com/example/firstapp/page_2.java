package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class page_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_2);

        final Button toastbut =  (Button) findViewById(R.id.button5);
        final EditText name = (EditText) findViewById(R.id.editTextTextPersonName2);
        View backbutton = (Button) findViewById(R.id.button6);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "I'm back!", Toast.LENGTH_SHORT).show();
                finish();
            }

        });

       final Context context = getApplicationContext();
       final int duration = Toast.LENGTH_SHORT;

       toastbut.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(name.getText().toString().equals("")){
                   Toast toast = Toast.makeText(context, "Nothing happened." , duration);
                   toast.show();
               }else {
                   String name2 = name.getText().toString();
                   Toast toast = Toast.makeText(context,"Name entered.", duration);
                   toast.show();
               }
           }
       });


    }
}