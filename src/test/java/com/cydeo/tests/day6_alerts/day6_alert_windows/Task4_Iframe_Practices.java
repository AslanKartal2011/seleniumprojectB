package com.cydeo.tests.day6_alerts.day6_alert_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_Iframe_Practices {


    public WebDriver driver;
    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/iframe" );
    }

   @Test

      public void iframe_test(){

        driver.switchTo().frame( "mce_0_ifr");
       WebElement yourContentGoesHereText = driver.findElement( By.xpath("//p") );
       Assert.assertTrue( yourContentGoesHereText.isDisplayed() );

      driver.switchTo().parentFrame();
      WebElement headerText=driver.findElement( By.xpath( "//h3 " ) );



        }


}
