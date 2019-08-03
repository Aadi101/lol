package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SugsAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugs);
    }

    public void onBack(View view){
        Intent intent = new Intent(SugsAct.this,MainActivity.class);
        startActivity(intent);
    }

    public void onBook1(View view){
        Intent intent = new Intent(SugsAct.this,Book1act.class);
        startActivity(intent);
    }

    public void onBook2(View view){
        Intent intent = new Intent(SugsAct.this,Book2act.class);
        startActivity(intent);
    }
}
