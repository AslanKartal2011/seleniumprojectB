package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {


public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
        driver.get("https://practice.cydeo.com/web-tables");
       }


    @Test
    public void order_name_verify_test(){
        WebElement bobMartinCell=
                driver.findElement( By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[7]/td[.='Bob Martin']") );
        System.out.println("bobMartinCell.getText()  = "+ bobMartinCell.getText());

        String actualBobName= bobMartinCell.getText();
        String expectedBobName="Bob Martin";
        Assert.assertEquals( actualBobName,expectedBobName );


        // //td[.='Bob Martin']/../td[5]"
        WebElement bobMartinDateCell=
                driver.findElement( By.xpath( "//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]" ) );

        String expectedBobMartinDate="12/31/2021";
        String actualBobDate= bobMartinCell.getText();

        Assert.assertEquals( actualBobDate,expectedBobMartinDate );




    }

    @Test
    public void test2() {
        String costumerOrderDate1 = WebTableUtils.returnOrderDate( driver, "Alexandra Gray" );
        System.out.println( "costumerOrderDate1 = " + costumerOrderDate1 );

        String costumerOrderDate2 = WebTableUtils.returnOrderDate( driver, "John Doe" );
        System.out.println( "costumerOrderDate1 = " + costumerOrderDate2 );

    }

    @Test
    public  void test3(){
        WebTableUtils.orderVerify( driver,"Bart Fisher","01/16/2021" );
    }

}
