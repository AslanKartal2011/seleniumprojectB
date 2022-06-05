package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.day9_javafaker_testfaker_testbase_driverUtil.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {


    @Test
    public void crm_login_test_3(){

        driver.get( "https://login.nextbasecrm.com/");
        CRM_Utilities.crm_login(driver,"helpdesk2","UserUser");
        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle( driver,"(2) Portal" );

    }
}

