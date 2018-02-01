package com.example.lupis.simple_app2_cambi_deactv;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button changeColor;

        changeColor =  findViewById(R.id.buttonColor);


        changeColor.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
               LinearLayout myLayout;
                //myLayout = findViewById(R.id.layout);
                //myLayout.setBackground(Drawable.createFromPath("#849093"));
                changeColor.setText("Welcome");


            }
        });
        ////////////////////////////////////////////
        Button btnStartAnotherActivity;
        Button btnStartAnotherActivity2;
        btnStartAnotherActivity =  findViewById(R.id.button4);
        btnStartAnotherActivity2 = findViewById(R.id.button5);

        btnStartAnotherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, child1.class);
                startActivity(intent);
            }
        });

        btnStartAnotherActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, child2.class);
                startActivity(intent);
            }
        });
    }
}
