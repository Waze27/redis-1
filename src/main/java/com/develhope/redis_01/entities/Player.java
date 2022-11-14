package com.develhope.redis_01.entities;

public class Player {

    private String name;
    private String surname;
    private String email;
    private String passwordEncrypted;

    public Player(){}

    public Player(String name, String surname, String email, String passwordEncrypted){
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.passwordEncrypted = passwordEncrypted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordEncrypted() {
        return passwordEncrypted;
    }

    public void setPasswordEncrypted(String passwordEncrypted) {
        this.passwordEncrypted = passwordEncrypted;
    }
}
