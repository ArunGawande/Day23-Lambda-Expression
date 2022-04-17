package com.bridgelabz.UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class InvalidUserInputException extends Exception
{
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        try {
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.firstNameValidate("Arun");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.firstNameValidate("arun");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.lastNameValidate("Gawande");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.lastNameValidate("gawande");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.phoneNumberValidate("91 9561864842");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.phoneNumberValidate("9561864842");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
            Assert.assertTrue(result);
        } catch (Exception e) {
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        try{
            UserRegistrationMain userRegistrationRegEx = new UserRegistrationMain();
            boolean result = userRegistrationRegEx.passwordValidate("Ag23#%");
            Assert.assertFalse(result);
        } catch (Exception e) {
        }
    }
}
