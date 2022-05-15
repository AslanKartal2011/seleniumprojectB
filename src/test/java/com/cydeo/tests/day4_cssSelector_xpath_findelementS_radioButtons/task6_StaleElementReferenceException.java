package com.cydeo.tests.day4_cssSelector_xpath_findelementS_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class task6_StaleElementReferenceException {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/abtest" );

        WebElement cydeoLink = (WebElement) driver.findElements( By.xpath("//a[text()='CYDEO']"));
        System.out.println( "cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed() );

        driver.navigate().refresh();

    }
}
