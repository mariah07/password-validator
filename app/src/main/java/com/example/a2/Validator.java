package com.example.a2;


public class Validator {

    public Validator() {}

    public int Validate(String password){
        int i = 0;
        if(password.length() > 7)
            i++;
        if(!password.equalsIgnoreCase("password") )
            i++;
        if(password.matches(".*\\d.*"))
            i++;
        if(!password.matches("[a-zA-Z0-9]*"))
            i++;
        if(password.matches(".*[A-Z].*"))
            i++;

        return i;
    }
}
