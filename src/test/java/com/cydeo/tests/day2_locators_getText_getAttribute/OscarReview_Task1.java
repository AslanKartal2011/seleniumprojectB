package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OscarReview_Task1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get( "https://practice.cydeo.com" );
        driver.manage().window().maximize();
        WebElement forgotPasswordLink=driver.findElement( By.linkText( "Forgot Password ") );
        forgotPasswordLink.click();
        WebElement emailBox=driver.findElement( By.name( "email" ) );
        emailBox.sendKeys( "mart.smith@garbarage.com" );

    }

}
