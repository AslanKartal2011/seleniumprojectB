package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_Task2 {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get( "http://zero.webappsecurity.com/login.html " );

       WebElement HeaderText=driver.findElement( By.tagName("h3") );
        String actualHeaderText= HeaderText.getText();
        String expectedHeaderText = "Log in to ZeroBank";

        if(actualHeaderText.equals( expectedHeaderText )){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }



    }
}