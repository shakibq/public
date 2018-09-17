package com.example.raha.mokhche;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegNumber extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_number);
    }

    public void RegAsNumber_GetCode (View v){
        Button BtnRegNumber_GetCode = findViewById(R.id.BtnRegNumber_GetCode);
        Intent GoToRegNumberFinal = new Intent (this , RegNumberFinal.class);
        startActivity(GoToRegNumberFinal);

    }
}
