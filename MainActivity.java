package shubham.com.internetofthings;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void INTRODUCTION(View view){

        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }

    public void WhatIsInternetOfThings(View view){

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


    public void HistoryOfIOT(View view){

        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void BasicTermsInIOT(View view){

        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }


    public void ExamplesofIOT(View view){

        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    public void ApplicationsofIOT(View view){

        Intent intent = new Intent(this, SixthActivity.class);
        startActivity(intent);
    }

    public void AdvantagesofIOT(View view){

        Intent intent = new Intent(this, SeventhActivity.class);
        startActivity(intent);
    }

    public void DisadvantagesofIOT(View view){

        Intent intent = new Intent(this, EighthActivity.class);
        startActivity(intent);
    }

    public void HardwareusedinIOT(View view){

        Intent intent = new Intent(this, NinthActivity.class);
        startActivity(intent);
    }

    public void ToolsusedinIOT(View view){

        Intent intent = new Intent(this, TenthActivity.class);
        startActivity(intent);
    }

    public void ProgrammingLanguages(View view){

        Intent intent = new Intent(this, EleventhActivity.class);
        startActivity(intent);
    }

    public void HowIOTWorks(View view){

        Intent intent = new Intent(this, TwelthActivity.class);
        startActivity(intent);
    }

    public void IOTIndustries(View view){

        Intent intent = new Intent(this, ThirteenthActivity.class);
        startActivity(intent);
    }

    public void IOTCompanies(View view){

        Intent intent = new Intent(this, FourteenthActivity.class);
        startActivity(intent);
    }

}












