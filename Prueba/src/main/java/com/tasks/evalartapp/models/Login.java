package com.tasks.evalartapp.models;

public class Login
{
    private final String USER_NAME, PASWORD;

    public Login(String USER_NAME, String PASWORD) {
        this.USER_NAME = USER_NAME;
        this.PASWORD = PASWORD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public String getPASWORD() {
        return PASWORD;
    }
}
