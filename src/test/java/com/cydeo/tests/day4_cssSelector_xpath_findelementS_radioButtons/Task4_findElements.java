package com.cydeo.tests.day4_cssSelector_xpath_findelementS_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task4_findElements {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/abtest" );
        List<WebElement> allLinks = driver.findElements( By.tagName( "a" ) );
        System.out.println( "allLinks.size() = " + allLinks.size() );
        for (WebElement each : allLinks) {
            System.out.println("Text of link:"+each.getText());
            System.out.println("HREF values "+each.getAttribute( "href" ));
        }


    }
}