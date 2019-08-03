package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onReading(View view){
        Intent intent = new Intent(MainActivity.this,ReadingActivity.class);
        startActivity(intent);
    }

    public void onCat(View view){
        Intent intent1 = new Intent(MainActivity.this,CatAct.class);
        startActivity(intent1);
    }

    public void onBook(View view){
        Intent intent2 = new Intent(MainActivity.this,MyBooksAct.class);
        startActivity(intent2);
    }

    public void onFutu(View view) {
        Intent intent3 = new Intent(MainActivity.this, FutuAct.class);
        startActivity(intent3);
    }

    public void onSug(View view) {
        Intent intent1 = new Intent(MainActivity.this, SugsAct.class);
        startActivity(intent1);
    }
}
