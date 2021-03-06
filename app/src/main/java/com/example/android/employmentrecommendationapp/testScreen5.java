package com.example.android.employmentrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class testScreen5 extends AppCompatActivity {
    int testScore;
    int screenScore = 0;
    boolean test = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen5);
        Intent intent= getIntent();
        testScore = intent.getIntExtra("testScore", 0);

    }

    public void onClickStartTestScreen5(View view) {

        if(test == true) {
            testScore = testScore + screenScore;
            Intent startIntent = new Intent(getApplicationContext(), resultsScreen.class);
            startIntent.putExtra("testScore", testScore);
            startActivity(startIntent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickToast1(View view) {

        Toast.makeText(getApplicationContext(), "parachute", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("parachute");
        screenScore = 1;
        test = true;

    }

    public void onClickToast2(View view) {

        Toast.makeText(getApplicationContext(), "gear", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("gear");
        screenScore = 2;
        test = true;
    }

    public void onClickToast3(View view) {

        Toast.makeText(getApplicationContext(), "heart", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("heart");
        screenScore = 3;
        test = true;
    }

    public void onClickToast4(View view) {

        Toast.makeText(getApplicationContext(), "clock", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("clock");
        screenScore = 4;
        test = true;
    }

}
