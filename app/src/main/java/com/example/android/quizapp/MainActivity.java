package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    //GLOBALS
    int scoreOfTest = 0;
    int numberOfQuestions = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
    }


    public void scoreButtonPressed(View view){

    }

    public void resetButtonPressed(View view){

    }



}
