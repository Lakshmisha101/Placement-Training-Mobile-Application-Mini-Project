package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class VerbalAndReasonings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbal_and_reasonings);

        SharedPreferences sharedPreferences=getSharedPreferences("shared_prefs", Context.MODE_PRIVATE);
        String username=sharedPreferences.getString("username"," ").toString();
        Toast.makeText(getApplicationContext(), "Welcome To Verbal And Logical Reasoning Apptitude ", Toast.LENGTH_SHORT).show();

        CardView verbalAndReasoning=findViewById(R.id.CProgramming);
        verbalAndReasoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerbalAndReasonings.this,LogicalReasonings.class));
            }
        });

        CardView LogicalReasoning=findViewById(R.id.C_Programming);
        LogicalReasoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerbalAndReasonings.this,VerbalReasonings.class));
            }
        });

        CardView VerbalReasoningTest=findViewById(R.id.Java_Programming);
        VerbalReasoningTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerbalAndReasonings.this,VerbalReasoningTest.class));
            }
        });
        CardView LogicalReasoningTest=findViewById(R.id.ProgrammingTest);
        LogicalReasoningTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VerbalAndReasonings.this,LogicalReasoningTest.class));
            }
        });
    }
}