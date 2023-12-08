package com.example.vigorwellnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {
    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        button1=findViewById(R.id.startyoga1);
        button2=findViewById(R.id.startyoga2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });



        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        if(id == R.id.id_privacy){

            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://iotexpert1.blogspot.com/2020/10/weight-loss-privacy-ploicy-page.html"));
            startActivity(intent);

            return true;
        }
        if(id == R.id.id_term){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://iotexpert1.blogspot.com/2020/10/weight-loss-terms-and-conditions-page.html"));
            startActivity(intent);


            return true;
        }
        if(id == R.id.rate){
            try {

                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("markey://details?id="  + getPackageName())));
            }catch (Exception ex){
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));

            }


            return true;
        }
        if(id == R.id.more){

            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/developer?id=Monsanto+Bogays&h1=en_US&g1=US"));
            startActivity(intent);
            return true;
        }
        if(id == R.id.share){

            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = "This is the best for yoga \n By this app you streach your body\n This is the free download Now \n"+"\"https://play.google.com/store/apps/details?id=com.example.vigorwellnessapp&hl=en";
            String sharehub= "Vigor Wellness App";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(myIntent,"share using"));

            return true;
        }

        return true;
    }


    public void beforeage18(View view){
        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
    public void afterage18(View view){
        Intent intent= new Intent(MainActivity.this,SecondActivity2.class);
        startActivity(intent);
    }
    public void food(View view){

        Intent intent= new Intent(MainActivity.this,FoodActivity.class);
        startActivity(intent);

    }
}