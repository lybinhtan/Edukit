package com.example.edukit_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class UI_Control extends AppCompatActivity {

    ImageButton btn_Forward,btn_Back, btn_Left, btn_Right, btn_Stop, btn_Boost;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui__control);

        btn_Forward = findViewById(R.id.btn_Forward);
        btn_Back    = findViewById(R.id.btn_Back);
        btn_Left    = findViewById(R.id.btn_Left);
        btn_Right   = findViewById(R.id.btn_Right);
        btn_Stop    = findViewById(R.id.btn_Stop);
        btn_Boost   = findViewById(R.id.btn_Boost);

        btn_Forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UI_Control.this, "Forward", Toast.LENGTH_SHORT).show();
                //btn_Foward.setVisibility(View.INVISIBLE);

            }
        });

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UI_Control.this, "Back", Toast.LENGTH_SHORT).show();

            }
        });

        btn_Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UI_Control.this, "Left", Toast.LENGTH_SHORT).show();

            }
        });

        btn_Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UI_Control.this, "Right", Toast.LENGTH_SHORT).show();

            }
        });

        btn_Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UI_Control.this, "Stop", Toast.LENGTH_SHORT).show();

            }
        });

        btn_Boost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UI_Control.this, "High Speed", Toast.LENGTH_SHORT).show();

            }
        });





    }
}
