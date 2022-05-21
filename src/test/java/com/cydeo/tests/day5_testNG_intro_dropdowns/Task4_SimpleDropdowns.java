package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_SimpleDropdowns {

    @BeforeMethod
    public void setupMethod(){
        //Do browser driver and open
      WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }


    @Test
    public void simpleDropdownTest(){
        WebDriver driver = WebDriverFactory.getDriver( "chrome" );
        Select simpleDropDown = new Select(driver.findElement( By.xpath("//select[@id='dropdown']")));

        WebElement currentSelectedOption =simpleDropDown.getFirstSelectedOption();

        String actualSimpleDropdownText=currentSelectedOption.getText();

        String expectedSimpleDropdownText ="Please select an option";

        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);

        Select stateDropdown =new Select(driver.findElement(By.xpath( "//select[@id='state']" )));

        String expectedStateDropdownText ="Select a State";
        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualStateDropdownText,expectedSimpleDropdownText);
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(), "Select a State");





    }



}
