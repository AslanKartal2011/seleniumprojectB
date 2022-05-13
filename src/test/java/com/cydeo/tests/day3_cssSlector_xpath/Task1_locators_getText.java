package com.cydeo.tests.day3_cssSlector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_locators_getText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get( "https://login1.nextbasecrm.com" );

        WebElement inputUsername = driver.findElement( By.className( "login-inp" ) );
        inputUsername.sendKeys( "incorrect" );


        WebElement loginButton= driver.findElement( By.className( "login-btn" ) );
        loginButton.click();

        WebElement errorMessage = driver.findElement( By.className( "errortext" ) );
        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText();

        if (expectedErrorMessage.equals( actualErrorMessage )) {
            System.out.println( "Passed" );

        } else {

            System.out.println( "Failed" );
        }
    }
}