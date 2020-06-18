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

    @Test
    public void giveFirstName_WhenInvalid_shouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validateFirstName("sdf#sdf");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveLastName_WhenValid_shouldReturnTrue() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validateLastName("Singh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveLastName_WhenSort_shouldReturnFalse() {
        UserValidation validator = new UserValidation();
        boolean result = validator.validateLastName("Si");
        Assert.assertEquals(false, result);
    }


}
