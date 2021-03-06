package com.cydeo.tests.day4_cssSelector_xpath_findelementS_radioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task5_checkboxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/checkboxes" );

         WebElement checkbox1= driver.findElement( By.xpath( "//input[@name='checkbox1']" ) );
         WebElement checkbox2= driver.findElement( By.xpath( "//input[@name='checkbox2']" ) );

        System.out.println( "checkbox1.isSelected(),expecting false = " + checkbox1.isSelected() );
        System.out.println( "checkbox2.isSelected(), expecting true = " + checkbox2.isSelected() );

        Thread.sleep( 2000 );
        checkbox1.click();

        Thread.sleep( 2000 );
        checkbox2.click();

        System.out.println( "checkbox1.isSelected() = " + checkbox1.isSelected() );
        System.out.println( "checkbox2.isSelected() = " + checkbox2.isSelected() );

    }
}
