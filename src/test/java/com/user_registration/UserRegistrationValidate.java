package com.user_registration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationValidate {
    @Test
    public void giveFirstName_WhenValid_shouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validateFirstName("Anubhav");
        Assert.assertEquals(true, result);
    }
    @Test
    public void giveFirstName_WhenSort_shouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validateFirstName("An");
        Assert.assertEquals(false, result);
    }


}
