package com.example.myapplication;

import androidx.annotation.RequiresPermission;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
    }

    public void onAdd(View view){
        Intent intent1 = new Intent(ReadingActivity.this,AddbookRead.class);
        startActivity(intent1);
    }
}
