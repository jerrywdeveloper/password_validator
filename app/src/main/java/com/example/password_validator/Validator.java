package com.example.password_validator;

import androidx.annotation.Nullable;

public class Validator {

    public Validator(){
    }

    //Public_Methods

    //String_not_password Rule
    public boolean strCheck(String a){
        return !a.toLowerCase().equals("password");
    }

    //Length Rule
    public boolean strLenCheck(String a){
        if (a.length() > 8){
            return true;
        }
        return false;
    }

    //New Rule
    public boolean stringHasSpecial(String a){
        //i.e does not include only alphabets and numbers
        return a.toLowerCase().replaceAll("[a-z0-9 ]","").length() >= 1;
    }

    public boolean stringHasNum(String a){
        return a.matches("(.*)[0-9](.*)");
    }

    public boolean stringHasCase(String a) {
        return a.matches("(.*)[A-Z](.*)") && a.matches("(.*)[a-z](.*)");
    }

}
