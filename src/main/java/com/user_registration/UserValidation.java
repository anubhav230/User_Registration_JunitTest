package com.user_registration;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String namePattern = "^[A-Z][a-z]{2,}";
    public static final String emailPattern = "^[0-9a-zA-Z]+([. _ + -][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})$";


    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(firstName).matches();
    }
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(lastName).matches();
    }

    //Validate pattern for emailid
    public static boolean validEmailId(String emialId) {
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(emialId).matches();
    }

}
