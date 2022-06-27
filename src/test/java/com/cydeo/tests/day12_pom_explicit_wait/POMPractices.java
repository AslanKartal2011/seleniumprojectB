package com.cydeo.tests.day12_pom_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @Test
    public void required_field_error_message_test(){

        Driver.getDriver().get( "https://library1.cydeo.com" );
        libraryLoginPage = new LibraryLoginPage();
        LibraryLoginPage.signInButton.click();
        Assert.assertTrue( LibraryLoginPage.fieldRequiredErrorMessage.isDisplayed() );

    }

    @Test
    public void invalid_email_format_error_message_test(){

        Driver.getDriver().get(" https://libray1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.inputUsername.sendKeys( "something wrong" );
        libraryLoginPage.signInButton.click();
        Assert.assertTrue( libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed() );

        Driver.closeDriver();

    }



}
