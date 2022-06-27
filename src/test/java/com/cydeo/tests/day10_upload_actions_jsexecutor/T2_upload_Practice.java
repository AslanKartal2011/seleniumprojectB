package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_upload_Practice {

    @Test
    public void upload_test(){

        Driver.getDriver().get( "https://practice.cydeo.com/upload" );
        String path="\u202AC:\\Users\\44750\\OneDrive\\Desktop\\Aslan\\photo-1533090161767-e6ffed986c88.jpg";

        WebElement fileUpload = Driver.getDriver().findElement( By.id("file-upload"));

        BrowserUtils.sleep( 2 );
        fileUpload.sendKeys( path );

        WebElement uploadButton = Driver.getDriver().findElement( By.id("file-submit"));
        uploadButton.click();

        WebElement fileUpLoadedHeader=Driver.getDriver().findElement( By.tagName( "h3" ) );
        Assert.assertTrue( fileUpLoadedHeader.isDisplayed() );

    }
}
