package com.example.personapplication;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.Nullable;

import java.io.File;

public class DatabaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //
        File dbFile = this.getDatabasePath("test02.db");
        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase(dbFile, null);

        // Create Person table
        db.execSQL("CREATE TABLE IF NOT EXISTS Person (FirstName Text, LastName Text, SSN INTEGER)");

        // 3 ways to insert into table
        // 1
        db.execSQL("INSERT INTO Person VALUES ('James', 'Shen', 3748374837)");

        // 2
        db.execSQL("INSERT INTO Person VALUES (?,?,?)", new String[]{"Mary", "Hsu", "9389348949"});

        // 3
        ContentValues vals = new ContentValues();
        vals.put("FirstName", "Jerry");
        vals.put("LastName", "Ramos");
        vals.put("SSN", 398493841);
        db.insert("Person", null, vals);

        db.close();
    }
}
