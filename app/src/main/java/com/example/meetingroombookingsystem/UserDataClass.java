package com.example.meetingroombookingsystem;

public class UserDataClass {
    String email,password,mobi_number;
    public UserDataClass(){

    }
    public UserDataClass(String email, String password, String mobi_number) {
        this.email = email;
        this.password = password;
        this.mobi_number = mobi_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobi_number() {
        return mobi_number;
    }

    public void setMobi_number(String mobi_number) {
        this.mobi_number = mobi_number;
    }


}
