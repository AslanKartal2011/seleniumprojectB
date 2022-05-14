package com.cydeo.tests.day3_cssSlector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5_locators_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();

        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/" );

        WebElement username= driver.findElement( By.className( "login-inp" ) );
        username.sendKeys( "incorrect" );


        WebElement loginButton =driver.findElement( By.className( "login-btn" ));
        loginButton.click();


        String expectedLogin=" Incorrect login or password ";
        String actualLogin=loginButton.getText();

        if(actualLogin.equals ( expectedLogin )){
            System.out.println( "Passed" );
        }else{
            System.out.println("Failed");
        }

    }
}
