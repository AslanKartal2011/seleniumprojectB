package com.cydeo.tests.day1.selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://www.google.com" );


        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.equals( expectedURL )) {
            System.out.println( "URL PASS" );
        } else {
            System.out.println( "URL FAILED " );
        }

        String actualTitle ="Practice";
        String expectedTitle= driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println( "Title verification PASSED!" );
        } else {
            System.out.println( "Title verification FAILED!!! " );
        }

        driver.close();

    }
}