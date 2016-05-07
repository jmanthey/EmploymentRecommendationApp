package com.example.android.employmentrecommendationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class resultsScreen extends AppCompatActivity {
    int testScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_screen);
        Intent intent= getIntent();
        testScore = intent.getIntExtra("testScore", 0);

        if(testScore < 6){
            ((TextView)findViewById(R.id.yourSelection)).setText("Pilot");
            ((TextView)findViewById(R.id.jobButton)).setText("Pilot");
        }

        else if(testScore < 11){
            ((TextView)findViewById(R.id.yourSelection)).setText("Scientist");
            ((TextView)findViewById(R.id.jobButton)).setText("Scientist");
        }

        else if(testScore < 16){
            ((TextView)findViewById(R.id.yourSelection)).setText("Physician");
            ((TextView)findViewById(R.id.jobButton)).setText("Physician");
        }

        else if(testScore < 30 ){
            ((TextView)findViewById(R.id.yourSelection)).setText("Lawyer");
            ((TextView)findViewById(R.id.jobButton)).setText("Lawyer");
        }

    }

    public void goToWebsite (View view) {
        if(testScore < 6){
            goToUrl("https://en.wikipedia.org/wiki/Pilot_(aeronautics)");
        }

        else if(testScore < 11){
            goToUrl("https://en.wikipedia.org/wiki/Scientist");
        }

        else if(testScore < 16){
            goToUrl("https://en.wikipedia.org/wiki/Physician");
        }

        else if(testScore < 30) {
            goToUrl("https://en.wikipedia.org/wiki/Lawyer");
        }

    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void onClickStartTestScreen2(View view) {
            testScore = 0;
            Intent startIntent = new Intent(getApplicationContext(), testScreen1.class);
            startIntent.putExtra("testScore", testScore);
            startActivity(startIntent);


    }


}
