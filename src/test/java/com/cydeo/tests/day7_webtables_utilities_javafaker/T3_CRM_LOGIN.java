package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {

   public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver( "chrome" );
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS );
    }

    @Test
    public void crm_login_test_3(){

        driver.get( "https://login.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver,"helpdesk2","UserUser");
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle( driver,"(2) Portal" );

    }
}

