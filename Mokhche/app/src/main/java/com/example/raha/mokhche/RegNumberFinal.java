package com.example.raha.mokhche;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegNumberFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_number_final);
    }

    public void RegAsNumber_SendCode (View v){

        Button BtnRegNumber_SendCode = findViewById(R.id.BtnRegNumber_SendCode);
        Intent GoToMainPage = new Intent (this , MainPage.class);
        startActivity(GoToMainPage);
    }
}
