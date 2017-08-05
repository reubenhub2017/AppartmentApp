package com.example.reubenukah.appartmentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class ImageUpload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_upload);
    }

public void sendtoHomeScreen(View view){
    Intent intent = new Intent(this, HomeScreen.class);
    startActivity(intent);



}
}
