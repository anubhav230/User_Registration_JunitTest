package com.user_registration;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String namePattern = "^[A-Z][a-z]{2,}";
    public static final String emailPattern = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";
    public static final String mobileNumberPattern = "^[0-9]{1,3}[ ][0-9]{10}$";
    public static final String passwordPatten = "((?=.*[A-Z])(?=.*\\d)(?=.*[#$@]){1}.{8})$";

    /**
     *
     * @param firstName
     * @return
     */
    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(firstName).matches();
    }

    /**
     *
     * @param lastName
     * @return
     */
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(lastName).matches();
    }

    /**
     *
     * @param emialId
     * @return
     */
    public static boolean validEmailId(String emialId) {
        Pattern pattern = Pattern.compile(emailPattern);
        return pattern.matcher(emialId).matches();
    }

    /**
     *
      * @param mobileNumber
     * @return
     */
    public static boolean validMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(mobileNumberPattern);
        return pattern.matcher(mobileNumber).matches();
    }

    /**
     *
     * @param password
     * @return
     */
    public static boolean validPassword(String password) {
        Pattern pattern = Pattern.compile(passwordPatten);
        return pattern.matcher(password).matches();
    }




}
