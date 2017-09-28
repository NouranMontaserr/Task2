package com.example.android.todo.database;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by Lenovo on 9/9/2017.
 */

public final class todolist {

//    public static final String CONTENT_AUTHORITY = "com.example.android.todo";
//    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
//    public static final String PATH_TODO = "todo";

    private todolist() {}

    public static class todoEntry implements BaseColumns{
//        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_TODO);
        public static final String TABLE_NAME = "todo";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_TODO_TEXT ="text";
        public static final String COLUMN_TODO_DAATE ="dAte";
        public static final String COLUMN_TODO_TIIME ="tIme";


    }
}
