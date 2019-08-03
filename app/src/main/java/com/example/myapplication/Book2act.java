package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Book2act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2act);
    }

    public void onBack(View view){
        Intent intent = new Intent(Book2act.this,SugsAct.class);
        startActivity(intent);
    }
}
