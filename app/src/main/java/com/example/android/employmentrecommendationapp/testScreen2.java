package com.example.android.employmentrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class testScreen2 extends AppCompatActivity {
    int testScore;
    int screenScore = 0;
    boolean test = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen2);
        Intent intent= getIntent();
        testScore = intent.getIntExtra("testScore", 0);
    }

    public void onClickStartTestScreen3(View view) {

        if(test == true) {
            testScore = testScore + screenScore;
            Intent startIntent = new Intent(getApplicationContext(), testScreen3.class);
            startIntent.putExtra("testScore", testScore);
            startActivity(startIntent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_SHORT).show();

        }
    }

    public void onClickToast1(View view) {

        Toast.makeText(getApplicationContext(), "energtic and and willing to try new things", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("energtic and and willing to try new things");
        screenScore = 1;
        test = true;

    }

    public void onClickToast2(View view) {

        Toast.makeText(getApplicationContext(), "factual and unemotional", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("factual and unemotional");
        screenScore = 2;
        test = true;
    }

    public void onClickToast3(View view) {

        Toast.makeText(getApplicationContext(), "good listener and friendly", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("good listener and friendly");
        screenScore = 3;
        test = true;
    }

    public void onClickToast4(View view) {

        Toast.makeText(getApplicationContext(), "hard worker they can count on", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("hard worker they can count on");
        screenScore = 4;
        test = true;
    }

}
