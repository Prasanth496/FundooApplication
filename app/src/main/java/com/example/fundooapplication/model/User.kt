package com.example.fundooapplication.model

class User {

    private var id : Int = 0
    private lateinit var name : String
    private lateinit var email : String
    private lateinit var password : String

    fun getId(): Int {
        return id
    }

    fun setId(id : Int) {
        this.id = id
    }

    fun getName() : String {
        return name
    }

    fun setname(name : String) {
        this.name = name
    }

    fun getEmail() : String {
        return email
    }

    fun setEmail(email : String) {
        this.email = email
    }

    fun getPassword() : String {
        return password
    }

    fun setPassword(password : String) {
        this.password = password
    }
}
