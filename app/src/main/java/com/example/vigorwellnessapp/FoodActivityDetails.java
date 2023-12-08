package com.example.vigorwellnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class FoodActivityDetails extends AppCompatActivity {

    TextView textView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);



        textView=findViewById(R.id.txt);
        String dstory=getIntent().getStringExtra("story");
        textView.setText(dstory);

    }
    public void gooback(View view){
        Intent intent=new Intent(FoodActivityDetails.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        Intent intent=new Intent(FoodActivityDetails.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }
}