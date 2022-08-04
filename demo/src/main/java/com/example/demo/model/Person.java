package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;


// A model class of an object
public class Person {
    private UUID id;
    private String userName;
    private String passWord;

    public Person(@JsonProperty("id") UUID id,@JsonProperty("username") String userName,@JsonProperty("password") String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

//    public Person(@JsonProperty("username") String userName,@JsonProperty("password") String passWord) {
//        this.userName = userName;
//        this.passWord = passWord;
//        this.id = UUID.randomUUID();
//    }

    public UUID getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
