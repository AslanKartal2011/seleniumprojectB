package com.cydeo.tests.day4_cssSelector_xpath_findelementS_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day4_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password" );

        // forgot header using cssSelector
         WebElement homeLink_ex1 =driver.findElement( By.cssSelector("a[class='nav-link']") );

        // forgot header using cssSelector
         WebElement header_ex1= driver.findElement( By.cssSelector( ("div.example > h2") ) );

        //forgot header using xpath
        WebElement header_ex2=driver.findElement( By.xpath( "//h2[text()='Forgot Password']" ));

                // "E_mail" text
        WebElement emailLabel =driver.findElement( By.xpath( "//label[@for='email']" ) );

        // E-mail input box
        WebElement inputBox_ex1=driver.findElement( By.xpath( "//input[@='email']" ) );

        // tagName[contains(@attribute,'value')]
        WebElement inputBox_ex2=driver.findElement( By.xpath( "//input[contains(@pattern,'a-z'" ) );

        // "Retrieve password" button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordButton=driver.findElement( By.xpath( "//button[@id='form_submit']" ) );


        // "Powered by Cydeo text
        WebElement poweredByCydeoText =driver.findElement( By.xpath( "//div[@style='text-align:center;']" ) );


        // Verify all web elements are displayed.

        System.out.println( "homeLink_ex1 = " + homeLink_ex1.isDisplayed() );
        System.out.println( "emailLabel = " + emailLabel.isDisplayed() );
        System.out.println( "header_ex1 = " + header_ex1.isDisplayed() );
        System.out.println( "inputBox_ex2 = " + inputBox_ex2.isDisplayed() );
        System.out.println( "inputBox_ex1 = " + inputBox_ex1.isDisplayed() );
        System.out.println( "retrievePasswordButton = " + retrievePasswordButton.isDisplayed() );
        System.out.println( "poweredByCydeoText = " + poweredByCydeoText.isDisplayed() );








    }

}
