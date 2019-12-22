package com.sourcey.materiallogindemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DatabaseHelper extends SQLiteOpenHelper {

    public static final String KEY_ROWID = "_id";
    public static final String KEY_IDENTIFICATION= "identification";
    public static final String KEY_PASSWORD = "password";
//    private static final String TAG = "DBAdapter";

    private static final String DB_NAME = "TestDB";
    private static final String DB_TABLE = "users";
    private static final int DB_VERSION = 2;
    private static String DB_PATH = "/data/data/com.sourcey/materialloginexample/databases";
    private final Context mContext;

    private SQLiteDatabase db;

    DatabaseHelper(Context context) {
        super(context,DB_NAME, null, DB_VERSION);
        if(android.os.Build.VERSION.SDK_INT >= 4.2){
            DB_PATH = context.getApplicationInfo().dataDir + "/databases/";
        } else {
            DB_PATH = "/data/data/" + context.getPackageName() + "/databases/";
        }
        this.mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateDatabase(db,0,DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            /*Log.w(TAG, "Upgrading database from version " + oldVersion
                    + " to "
                    + newVersion + ", which will destroy all old data");*/
        updateDatabase(db,oldVersion,newVersion);
    }

    private static void updateDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if (oldVersion<1){
//            db.openOrCreateDatabase(DB_PATH+"TestDB.db",null);
            db.execSQL("create table users (_id integer primary key autoincrement, "
                    + "identification text not null, "
                    + "password text not null);");
        }
        if (oldVersion<2){
            AddUser(db,"a123","a123");
        }
    }

    private static void AddUser(SQLiteDatabase db, String identification, String password) {
        ContentValues userValues = new ContentValues();
        userValues.put(KEY_IDENTIFICATION, identification);
        userValues.put(KEY_PASSWORD, password);
        db.insert(DB_TABLE, null, userValues);
    }
}