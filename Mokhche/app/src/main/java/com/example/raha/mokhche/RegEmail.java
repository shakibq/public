package com.example.raha.mokhche;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_email);
    }

    public void RegAsEmail_1 (View v){

        Button RegAsEmail_1 = findViewById(R.id.BtnRegEmail_1);
        Intent GoToRegAsEmail = new Intent (this , MainPage.class);
        startActivity(GoToRegAsEmail);
    }
}
