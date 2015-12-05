package com.android.clase.controlestudiantes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Michel on 05/12/2015.
 */
public class DBHelper extends SQLiteOpenHelper {

    public final static String DB_NAME = "SENA"; //Nombre BD
    public final static int DB_VERSION = 1; //Version BD

    //    Constructor
    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    //  Crea la BD
    @Override
    public void onCreate(SQLiteDatabase db) { db.execSQL(DBManager.CREAR_TABLE);
    }
    // Actualiza BD
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}