package com.example.android.employmentrecommendationapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void onClickStartTest(View view) {

        Intent startIntent = new Intent(getApplicationContext(), testScreen1.class);
        startActivity(startIntent);
    }
}
