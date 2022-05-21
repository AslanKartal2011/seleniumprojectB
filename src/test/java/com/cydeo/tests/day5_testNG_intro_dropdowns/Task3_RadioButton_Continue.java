package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task3_RadioButton_Continue {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get( "https://practice.cydeo.com/radio_buttons" );

        List<WebElement> sportRadioButtons = driver.findElements( By.name( "sport" ) );

        for (WebElement each : sportRadioButtons) {
            String eachId = each.getAttribute( "id" );
            System.out.println( "eachId = " + eachId );

            if(eachId.equals("hockey")) {
                each.click();
                System.out.println( "Hockey is selected : " + each.isSelected() );
                break;
            }


        }



    }

}
