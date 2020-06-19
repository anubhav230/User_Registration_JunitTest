package com.user_registration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationValidate {

    UserValidation validator = new UserValidation();

    String validEmail[] = {"anubhavsingh230@gmail.com","abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
    String invalidEmail[] = {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com","abc..2002@gmail.com","abc.@gmail.com ","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
    String validPassword[] = {"Sss$1sss","A444$444","AA1@AAAA","A@@@a1@@","A2222#22","@aAa1aaa"};
    String invalidPassword[] = {"asdfdfdf","1111111111","$$$$$$$","wer","3456","11","----"};

    @Test
    public void giveFirstName_WhenValid_shouldReturnTrue() {
        boolean result = validator.validateFirstName("Anubhav");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFirstName_WhenValid2_shouldReturnTrue() {
        boolean result = validator.validateFirstName("Anu");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFirstName_WhenSort_shouldReturnFalse() {
        boolean result = validator.validateFirstName("An");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveFirstName_WhenAllSmall_shouldReturnFalse() {
        boolean result = validator.validateFirstName("anubhav");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveFirstName_WhenInvalid_shouldReturnFalse() {
        boolean result = validator.validateFirstName("sdf#sdf");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveLastName_WhenValid_shouldReturnTrue() {
        boolean result = validator.validateLastName("Singh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveLastName_WhenSort_shouldReturnFalse() {
        boolean result = validator.validateLastName("Si");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenEmailId_WhenInvalid_ShouldReturnFalse()
    {
        for (String email : invalidEmail)
        {
            boolean result = validator.validEmailId(email);
            Assert.assertEquals(false, result);
        }
    }

    @Test
    public void givenEmailId_WhenValid_ShouldReturnTrue()
    {
        for (String email : validEmail)
        {
            boolean result = validator.validEmailId(email);
            Assert.assertEquals(true, result);
        }
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        boolean result = validator.validMobileNumber("91 9885616725");
        Assert.assertEquals(true, result);
    }


    @Test
    public void givenPassword_WhenValid2_ShouldReturnTrue()
    {
        for (String email : validPassword)
        {
            boolean result = validator.validPassword(email);
            Assert.assertEquals(true, result);
        }
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse()
    {
        for (String email : invalidPassword)
        {
            boolean result = validator.validPassword(email);
            Assert.assertEquals(false, result);
        }
    }

}
