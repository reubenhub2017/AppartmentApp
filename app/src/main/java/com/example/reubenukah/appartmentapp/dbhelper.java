package com.example.reubenukah.appartmentapp;


import android.database.sqlite.*;
import android.provider.BaseColumns;
import android.content.*;

public class dbhelper extends  SQLiteOpenHelper {
    public static final String DATABASE_NAME = "appartment_db.db";
    public static final int DATABASE_VERSION = 1;
    public static Context context;

    public static class Entries implements BaseColumns {


        public static final String TABLE_NAME = "Users";
        public static final String COLUMN1 = "Landlords";
        public static final String COLUMN2 = "Tenets";
        public static final String COLUMN3 = "Full Name";
        public static final String COLUMN4 = "Confirm Password";
        public static final String COLUMN5 = "Password";
        public static final String COLUMN6 = "MOTTO";
    }

    public dbhelper() {
            super(context,DATABASE_NAME, null, DATABASE_VERSION);
        }


    public void onCreate(SQLiteDatabase db){
   db.execSQL(SQL_CREATE_ENTIRES);


    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL(SQL_DELETE_ENTIRES);
        onCreate(db);

    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion){
        onUpgrade(db, oldVersion, newVersion);

    }
    //Creating a table

    public static final String SQL_CREATE_ENTIRES = "CREATE TABLE " +
            Entries.TABLE_NAME + " (" +
            Entries.COLUMN1 + "TEXT " +
            Entries.COLUMN2 + "TEXT"  +
            Entries.COLUMN3 + "TEXT " +
            Entries.COLUMN4 + "TEXT" +
            Entries.COLUMN5 + "TEXT " +
                 ")";

//Deleting a table
    public static final String SQL_DELETE_ENTIRES = "DROP TABLE IF EXISTS " + Entries.TABLE_NAME;


}
