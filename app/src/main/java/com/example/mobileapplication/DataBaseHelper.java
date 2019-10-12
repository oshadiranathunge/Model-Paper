package com.example.mobileapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "paper.db";
    public static final String TABLE_NAME1 = "user_Table";
    public static final String COL_1 = "name";
    public static final String COL_2 = "passsword";
    public static final String COL_3 = "type";
    public static final String COL_4 = "ID";

    public static final String TABLE_NAME2 = "msg_Table";
    public static final String COL_5 = "user";
    public static final String COL_6 = "subject";
    public static final String COL_7 = "message";


    public DataBaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
