package com.cydeo.tests.day1.selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https:www.tesla.com");

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to( "https://google.com" );

        String currentTitle=driver.getTitle();
        System.out.println("currentTitle =" + currentTitle);

        String currentURL= driver.getCurrentUrl();
        System.out.println( "currentURL = " + currentURL );

        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        driver.close();

        driver.quit();



    }
}