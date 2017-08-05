package com.example.reubenukah.appartmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);


    }

    public void landlordActivity(View view){
        Intent landlordoptions = new Intent(this, Displaylandlord.class);
        startActivity(landlordoptions);

    }
    public void tenetActivity(View view){
        Intent tenetoptions = new Intent(this, Displaytenet.class);
        startActivity(tenetoptions);


    }
}
