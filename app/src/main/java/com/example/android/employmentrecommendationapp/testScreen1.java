package com.example.android.employmentrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class testScreen1 extends AppCompatActivity {
    int testScore = 0;
    boolean test = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen1);

    }

    public void onClickStartTestScreen2(View view) {

        if(test == true) {
            Intent startIntent = new Intent(getApplicationContext(), testScreen2.class);
            startIntent.putExtra("testScore", testScore);
            startActivity(startIntent);
        }
        else{
            Toast.makeText(getApplicationContext(), "Please make a selection", Toast.LENGTH_SHORT).show();

        }
    }

    public void onClickToast1(View view) {

        Toast.makeText(getApplicationContext(), "make them quickly and move on", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText(R.string.ts1a1);
        testScore = 1;
        test = true;

    }

    public void onClickToast2(View view) {

        Toast.makeText(getApplicationContext(), "take my time learning about the decision and think it through", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("take my time learning about the decision and think it through");
        testScore = 2;
        test = true;
    }

    public void onClickToast3(View view) {

        Toast.makeText(getApplicationContext(), "think about others and choose what is best for everyone", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("think about others and choose what is best for everyone");
        testScore = 3;
        test = true;
    }

    public void onClickToast4(View view) {

        Toast.makeText(getApplicationContext(), "look at what others have done and do that", Toast.LENGTH_SHORT).show();
        ((TextView)findViewById(R.id.yourSelection)).setText("look at what others have done and do that");
        testScore = 4;
        test = true;
    }



}
