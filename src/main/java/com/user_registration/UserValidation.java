package com.user_registration;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String namePattern = "^[A-Z][a-z]{2,}";
    public static final String emailPattern = "^[0-9a-zA-Z]+([. _ + -][0-9a-zA-Z]+)*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})$";
    public static final String mobileNumberPattern = "^[0-9]{1,3}[ ][0-9]{10}$";
    public static final String passwordPatten = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8}";

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
    //Validate pattern for mobile number
    public static boolean validMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(mobileNumberPattern);
        return pattern.matcher(mobileNumber).matches();
    }

    //Validate pattern for Password
    public static boolean validPassword(String password) {
        Pattern pattern = Pattern.compile(passwordPatten);
        return pattern.matcher(password).matches();
    }




}
