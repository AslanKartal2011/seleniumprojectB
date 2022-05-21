package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    @BeforeMethod
    public void setupMethod(){
        //Do browser driver and open
       WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Test
    public void selenium_test(){

      WebDriver driver= WebDriverFactory.getDriver( "chrome" );
      driver.get( "https://google.com" );
        String actualTitle= driver.getTitle();
        String  expectedTitle="Google";

        Assert.assertEquals(actualTitle,expectedTitle," Title is not matching here");
    }



}
