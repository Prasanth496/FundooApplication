package com.example.fundooapplication

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.fundooapplication.model.User
import javax.swing.UIManager.put


class DatabaseHelper : SQLiteOpenHelper {
    // Database version
    private val DATABASE_VERSION : Int = 1
    //Database name
    private val DATABASE_NAME : String = "Usermanager.db"
    // user table name
    private val TABLE_USER : String = "user"
    // user table columns
    private val COLUMN_USER_ID = "user_id"
    private val COLUMN_USER_NAME = "user_name"
    private val COLUMN_USER_EMAIL = "user_email"
    private val COLUMN_USER_PASSWORD = "user_password"

    // create table sql query
    private val CREATE_USER_TABLE = ("CREATE TABLE " + TABLE_USER + "("
            + COLUMN_USER_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + COLUMN_USER_NAME + " TEXT,"
            + COLUMN_USER_EMAIL + " TEXT," + COLUMN_USER_PASSWORD + " TEXT" + ")")

    // drop table sql query
    private val DROP_USER_TABLE = "DROP TABLE IF EXISTS $TABLE_USER"

    fun DatabaseHelper(context: Context?) {
        context;DATABASE_NAME;null; DATABASE_VERSION
    }


    override fun onCreate(db: SQLiteDatabase?) {
        if (db != null) {
            db.execSQL(CREATE_USER_TABLE)
        }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //Drop User Table if exist
        if (db != null) {
            db.execSQL(DROP_USER_TABLE)
        }
        // Create tables again
        onCreate(db)
    }

    fun addUser(user: User) {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(COLUMN_USER_NAME, user.getName())
        values.put(COLUMN_USER_EMAIL, user.getEmail())
        values.put(COLUMN_USER_PASSWORD, user.getPassword())
        // Inserting Row
        db.insert(TABLE_USER, null, values)
        db.close()
    }

}