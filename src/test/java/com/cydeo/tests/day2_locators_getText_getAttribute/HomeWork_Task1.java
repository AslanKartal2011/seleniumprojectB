package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_Task1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get( "https://www.etsy.com" );

        WebElement bb=driver.findElement( By.className( "wt-overlay__footer__action" ) );
        bb.getCssValue( "Accept" );
        bb.click();

        WebElement searchBox = driver.findElement( By.name( "search_query" ) );


        searchBox.sendKeys( "wooden spoon" + Keys.ENTER );

        String expectedSearchBox = "Wooden spoon | Etsy";
        String actualSearchBox = searchBox.getText();

        if (actualSearchBox.equals( expectedSearchBox )) {
            System.out.println( "verifiy is passed" );
        } else {
            System.out.println( "verify is failed!!!" );
        }
    }
}
