package com.cydeo.tests.day6_alerts.day6_alert_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Task5_dropDownPractices {

        public WebDriver driver;
        @BeforeMethod
             public void setupMethod(){

            driver = WebDriverFactory.getDriver( "chrome" );
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
            driver.get( "https://practice.cydeo.com/dropdown" );
        }


        @Test
        public void dropdown_task5() throws InterruptedException {

            Select stateDropdown = new Select( driver.findElement( By.xpath( "//select[@id='state']" ) ) );

            Thread.sleep( 1000 );
            stateDropdown.selectByVisibleText( "Illinois" );

            Thread.sleep( 1000 );
            stateDropdown.selectByValue( "VA" );

            Thread.sleep( 1000 );
            stateDropdown.selectByIndex( 5 );

            String expectedOptionText = "California";
            String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

            Assert.assertEquals( actualOptionText, expectedOptionText );

        }


        @Test
        public void dropDown_task6(){
            Select yearDropdown =new Select(driver.findElement( By.xpath( "//select[@id='year']" ) ));
            Select monthDropdown =new Select(driver.findElement( By.xpath( "//select[@id='month'] " ) ));
            Select dayDropdown =new Select(driver.findElement( By.xpath( "//select[@id='day'] " ) ));

            yearDropdown.selectByVisibleText( "1923" );
            monthDropdown.selectByValue( "11" );
            dayDropdown.selectByIndex( 0 );

            String expectedYear ="1923";
            String expectedMonth ="December";
            String expectedDay="1";

            String actualYear=yearDropdown.getFirstSelectedOption().getText();
            String actualMonth=monthDropdown.getFirstSelectedOption().getText();
            String actualDay=dayDropdown.getFirstSelectedOption().getText();

            Assert.assertTrue( actualYear.equals( expectedYear ) );
            Assert.assertTrue( actualMonth.equals( expectedMonth ) );
            Assert.assertEquals( actualDay, expectedDay);

        }


        @AfterMethod
        public  void teardownMethod(){
            driver.close();
        }

    }
