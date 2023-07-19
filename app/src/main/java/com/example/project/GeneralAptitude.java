package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class GeneralAptitude extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_aptitude);

        SharedPreferences sharedPreferences=getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username=sharedPreferences.getString("username"," ").toString();
        Toast.makeText(getApplicationContext(), "Welcome To Aritmetic Apptitude ", Toast.LENGTH_SHORT).show();

        CardView CProgramming=findViewById(R.id.CProgramming);
        CProgramming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeneralAptitude.this,ArithmeticAptitude.class));
            }
        });

        CardView C_Programming=findViewById(R.id.C_Programming);
        C_Programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeneralAptitude.this,DataInterpretation.class));
            }
        });

        CardView Java_Programming=findViewById(R.id.Java_Programming);
        Java_Programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeneralAptitude.this,QuizActivity.class));
            }
        });

        CardView ProgrammingTest=findViewById(R.id.ProgrammingTest);
        ProgrammingTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GeneralAptitude.this, DataInterpretationTest.class));
            }
        });
    }
}