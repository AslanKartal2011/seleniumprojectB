package com.cydeo.tests.day6_alerts.day6_alert_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class Task1_Alert_Practices {

    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/javascript_alerts" );
        }


    @Test
    public void alert_test1() {

        WebElement informationAlertButton =driver.findElement( By.xpath( "//button[.='Click for JS Alert']" ));
        informationAlertButton.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText =driver.findElement(By.xpath( "//p[@id='result']" ));
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");

        String expectedText ="You successfully clicked an alert";
        String actualText =resultText.getText();

        Assert.assertEquals( actualText, expectedText, "Actual result text is not as expected!!!" );

        }


}
