package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_GoogleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://www.google.com");
        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();// used to click on any button


        WebElement googleSearchBox= driver.findElement( By.name("q"));

        googleSearchBox.sendKeys( "apple" + Keys.ENTER);

        String expectedTitle="apple";
        String actualTitle =driver.getTitle();

        if(expectedTitle.equals( actualTitle )){
            System.out.println( "Title verification Passed");
        }else{
            System.err.println("Title verification Failed!!!");
        }

    }


}
