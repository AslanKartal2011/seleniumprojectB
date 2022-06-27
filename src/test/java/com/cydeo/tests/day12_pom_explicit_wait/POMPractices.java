package com.cydeo.tests.day12_pom_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    @Test
    public void required_field_error_message_test(){

        Driver.getDriver().get( "https://library1.cydeo.com" );
        LibraryLoginPage LibraryLoginPage = new LibraryLoginPage();
        LibraryLoginPage.signInButton.click();
        Assert.assertTrue( LibraryLoginPage.fieldRequiredErrorMessage.isDisplayed() );

    }
}
