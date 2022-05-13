package com.cydeo.tests.day3_cssSlector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3_getAtttibute_cddSelector {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.get( "https://login1.nextbasecrm.com/" );
        // WebElement signInButton = driver.findElement( By.className("login-btn") );
        WebElement signInButton = driver.findElement( By.cssSelector("input[class='login-btn']" ));

      String actualButtonText=  signInButton.getAttribute( "value" );
      String expectedSignInText="Log in";

      if(actualButtonText.equals( expectedSignInText )){
          System.out.println("passed");
        }else{
          System.out.println("Failed");
      }



    }
}
