package com.cydeo.tests.day3_cssSlector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2_getText_getAttribute {


    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome"  );
        driver.manage().window().maximize();


        driver.get( "https:/login1.nextbasecrm.com" );

        WebElement rememberMeLabel= driver.findElement( By.className("login-item-checkbox-label") );

        String expectedRememberMeLabel= "Remember me on this computer";
        String actualRememberMeLabel=rememberMeLabel.getText();

        if(actualRememberMeLabel.equals( expectedRememberMeLabel )){
            System.out.println("label verification Passed");
        }else{
            System.out.println("Failed");
        }

        WebElement forgotPassword = driver.findElement( By.className ( "login-link-forgot-pass" ));
        String expectedPasswordLinkText ="Forgot your password?";
        String actualForgotPasswordLinkText= forgotPassword.getText();
         if(actualForgotPasswordLinkText.equalsIgnoreCase( expectedPasswordLinkText )){
             System.out.println("passed");
         }else{
             System.out.println("actualForgotPasswordLinkText = "+ actualForgotPasswordLinkText);
             System.out.println("expectedForgotPasswordLinkText= "+ expectedPasswordLinkText);
         }


         String expectedInHref ="forgot_password=yes";
         String actualInHrefAttributeValue =forgotPassword.getAttribute( "href" );
         System.out.println( "actualInHrefAttributeValue = " + actualInHrefAttributeValue );


         if (actualInHrefAttributeValue.equals( expectedInHref )){
             System.out.println("HREF attribute value verification PASSED");
         }else{
             System.out.println("HREF attribute value verification FAILED");
         }




    }
}
