package com.example.raha.mokhche;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void RegAsNumber(View v) {
        Button BtnRegNumber = findViewById(R.id.BtnRegNumber);
        Intent GoToRegNumber = new Intent(this, RegNumber.class);
        startActivity(GoToRegNumber);

    }


    public void RegAsEmail(View v) {
        Button BtnRegEmail = findViewById(R.id.BtnRegEmail);
        Intent GoToRegAsEmail = new Intent(this, RegEmail.class);
        startActivity(GoToRegAsEmail);

    }


    public void RegAsGuest(View v) {
        Button BtnRegGuest = findViewById(R.id.BtnRegGuest);
        Intent GoToMainPage = new Intent(this, MainPage.class);
        startActivity(GoToMainPage);

    }
}
