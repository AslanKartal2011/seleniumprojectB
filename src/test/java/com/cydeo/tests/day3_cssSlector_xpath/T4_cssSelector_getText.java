package com.cydeo.tests.day3_cssSlector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {


    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.get( "Https://login1.nextbasecrm.com/?forgot password=yes" );
        WebElement resetPasswordButton=driver.findElement( By.cssSelector("button[class='login-btn']"));


        String expectedResetPasswordButtonTex="Reset password";
        String actualResetPasswordButtonText=resetPasswordButton.getText();

        if(actualResetPasswordButtonText.equals(expectedResetPasswordButtonTex)){
            System.out.println( "Passed" );
        }else{
            System.out.println( "Failed" );
        }


    }
}
