package com.example.android.employmentrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class testScreen3 extends AppCompatActivity {
    int testScore;
    int screenScore = 0;
    boolean test = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen3);
        Intent intent= getIntent();
        testScore = intent.getIntExtra("testScore", 0);

    }

    public void onClickStartTestScreen4(View view) {

        if(test == true) {
            testScore = testScore + screenScore;
            Intent startIntent = new Intent(getApplicationContext(), testScreen4.class);
            startIntent.putExtra("testScore", testScore);
            startActivity(startIntent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickToast1(View view) {

        Toast.makeText(getApplicationContext(), "be free and do things I want to do", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("be free and do things I want to do");
        screenScore = 1;
        test = true;

    }

    public void onClickToast2(View view) {

        Toast.makeText(getApplicationContext(), "be creative and make things", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("be creative and make things");
        screenScore = 2;
        test = true;
    }

    public void onClickToast3(View view) {

        Toast.makeText(getApplicationContext(), "help people get closer together", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("help people get closer together");
        screenScore = 3;
        test = true;
    }

    public void onClickToast4(View view) {

        Toast.makeText(getApplicationContext(), "keep my life organized", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("keep my life organized");
        screenScore = 4;
        test = true;
    }

}
