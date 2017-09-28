package com.example.android.todo.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.todo.database.todolist.todoEntry;

public class TODODBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "shelter.dp";
    public static final int DATABASE_VERSION = 1;

    public TODODBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createTable = "CREATE TABLE " + todoEntry.TABLE_NAME + " ( " +
                todoEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                todoEntry.COLUMN_TODO_TEXT + " TEXT NOT NULL, " +
                todoEntry.COLUMN_TODO_DAATE + " TEXT NOT NULL DEFAULT 0, " +
                todoEntry.COLUMN_TODO_TIIME + " TEXT NOT NULL DEFAULT 0);";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + todoEntry.TABLE_NAME);
        onCreate(db);
    }
}