package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task2_RadioButton_Handling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/radio_buttons" );


                                                                //By.xpath[@id='hockey']"
        WebElement hockeyButton = driver.findElement( By.xpath( "//label[.='Hockey']" ) );
        Thread.sleep( 2000 );
        hockeyButton.click();

        if(hockeyButton.isSelected()){
            System.out.println( "Button is selected.Verification PASSED!" );
        }else{
            System.out.println("Button is not selected.Verification FAILED!");
        }




    }
}
