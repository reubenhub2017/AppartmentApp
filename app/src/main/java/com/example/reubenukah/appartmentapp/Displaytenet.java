package com.example.reubenukah.appartmentapp;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;


public class Displaytenet extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.reubenukah.appartmentapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaytenet);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }


    public void sendinfo(View view) {

        Intent intent = new Intent(this, ImageUpload.class);

        EditText FN1 = (EditText) findViewById(R.id.FN1);
        String FN = FN1.getText().toString();

        EditText Password = (EditText) findViewById(R.id.Password);
        String Password1 = Password.getText().toString();

        EditText Email = (EditText) findViewById(R.id.Email);
        String Email1 = Email.getText().toString();

        EditText ConfirmPassword = (EditText) findViewById(R.id.ConfirmPassword);
        String ConfirmPassword1 = ConfirmPassword.getText().toString();


        System.out.println(FN);
        System.out.println(Password1);
        System.out.println(Email1);


       // values.put(dbhelper.Entries.COLUMN1, FN);
        //long newRowId = db.insert(dbhelper.Entries.TABLE_NAME, null, values);


        startActivity(intent);
        intent.putExtra(EXTRA_MESSAGE, FN);


    }


}
//getters and setters

