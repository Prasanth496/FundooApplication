package com.example.fundooapplication

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper : SQLiteOpenHelper() {
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



    override fun onCreate(db: SQLiteDatabase?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}