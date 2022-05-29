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

public class Task2_Alert_Practices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/javascript_alerts" );
    }

    @Test
    public void alert_test2() {
        WebElement JS_Confirm =driver.findElement( By.xpath( "//button[@onclick='jsConfirm()']" ) );
        JS_Confirm.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement resultText =driver.findElement(By.xpath( "//p[@id='result']" ));
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");
        String expectedText ="You clicked: Ok";
        String actualText =resultText.getText();

        Assert.assertEquals( actualText, expectedText, "Actual result text is not as expected!!!" );


    }

    @Test
    public void alert_Test3(){

        WebElement JS_Prompt_button =driver.findElement( By.xpath( "//button[@onclick='jsPrompt()']" ) );
        JS_Prompt_button.click();

        Alert alert =driver.switchTo().alert();
        alert.accept();

        WebElement resultText =driver.findElement( By.xpath( "//p[@id='result']" ) );
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");
        String expectedText ="You entered:";
        String actualText =resultText.getText();

        Assert.assertEquals( actualText, expectedText, "Actual result text is not as expected!!!" );

    }
}