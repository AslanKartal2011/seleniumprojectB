package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}

    private  static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            String browserType =ConfigurationReader.getProperty( "browser" );

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
                    break;
            }
        }
        return driver;
    }




}
