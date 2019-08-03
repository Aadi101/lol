package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddbookRead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addbook_read);
    }
    public void onAddDone(View view){
        Intent intent1 = new Intent(AddbookRead.this,ReadingActivity.class);
        startActivity(intent1);
    }
}
