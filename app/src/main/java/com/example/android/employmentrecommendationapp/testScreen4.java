package com.example.android.employmentrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class testScreen4 extends AppCompatActivity {
    int testScore;
    int screenScore = 0;
    boolean test = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen4);
        Intent intent= getIntent();
        testScore = intent.getIntExtra("testScore", 0);

    }

    public void onClickStartTestScreen5(View view) {

        if(test == true) {
            testScore = testScore + screenScore;
            Intent startIntent = new Intent(getApplicationContext(), testScreen5.class);
            startIntent.putExtra("testScore", testScore);
            startActivity(startIntent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickToast1(View view) {

        Toast.makeText(getApplicationContext(), "bravery", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("bravery");
        screenScore = 1;
        test = true;

    }

    public void onClickToast2(View view) {

        Toast.makeText(getApplicationContext(), "knowledge", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("knowledge");
        screenScore = 2;
        test = true;
    }

    public void onClickToast3(View view) {

        Toast.makeText(getApplicationContext(), "empathy", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("empathy");
        screenScore = 3;
        test = true;
    }

    public void onClickToast4(View view) {

        Toast.makeText(getApplicationContext(), "perspective", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("perspective");
        screenScore = 4;
        test = true;
    }

}
