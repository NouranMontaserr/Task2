package com.example.android.todo;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.example.android.todo.database.todolist.todoEntry;

public class TODOCursorAdapter extends CursorAdapter {

    public TODOCursorAdapter(Context context, Cursor c) {
        super(context, c);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
    }
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView txtTextView = (TextView) view.findViewById(R.id.txt);
        final TextView dateTextView = (TextView) view.findViewById(R.id.date);
        final TextView timeTextView = (TextView) view.findViewById(R.id.timee);
        int txtColumnIndex = cursor.getColumnIndex(todoEntry.COLUMN_TODO_TEXT);
        int dateColumnIndex = cursor.getColumnIndex(todoEntry.COLUMN_TODO_DAATE);
        int timeColumnIndex = cursor.getColumnIndex(todoEntry.COLUMN_TODO_TIIME);
        String todotxt = cursor.getString(txtColumnIndex);
        String tododate = cursor.getString(dateColumnIndex);
        String todotime = cursor.getString(timeColumnIndex);
        txtTextView.setText(todotxt);
        dateTextView.setText(tododate);
        timeTextView.setText(todotime);

        txtTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateTextView.setVisibility(View.VISIBLE);
                timeTextView.setVisibility(View.VISIBLE);
            }
        });
        dateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateTextView.setVisibility(View.GONE);
                timeTextView.setVisibility(View.GONE);
            }
        });
        timeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dateTextView.setVisibility(View.GONE);
                timeTextView.setVisibility(View.GONE);
            }
        });
    }

}