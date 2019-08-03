package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Book1act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1act);
    }

    public void onBack(View view){
        Intent intent = new Intent(Book1act.this,SugsAct.class);
        startActivity(intent);
    }
}
