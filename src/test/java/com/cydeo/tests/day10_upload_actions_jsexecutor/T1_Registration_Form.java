package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){

        Driver.getDriver().get( ConfigurationReader.getProperty( "registration.form.url" ) );

        Faker faker=new Faker();

        WebElement inputFirstName= Driver.getDriver().findElement( By.xpath("//input[@name='firstname']"  ) );
        inputFirstName.sendKeys(faker.name().firstName());

        WebElement inputLastName= Driver.getDriver().findElement( By.xpath("//input[@name='lastname']"  ) );
        inputLastName.sendKeys(faker.name().lastName());

        WebElement inputUserName= Driver.getDriver().findElement( By.xpath("//input[@name='username']"  ) );
        //inputUserName.sendKeys(faker.name().username().replaceAll(".","" ));
        //inputUserName.sendKeys( faker.bothify( "helpdesk###") );
        String user=faker.bothify( "helpdesk###" );
        inputUserName.sendKeys(user);

        WebElement inputEmail= Driver.getDriver().findElement( By.xpath("//input[@name='email']"  ) );
        inputEmail.sendKeys(faker.bothify( user+"email.com" ));

        WebElement inputPassword= Driver.getDriver().findElement( By.xpath("//input[@name='password']"  ) );
        inputPassword.sendKeys(faker.numerify( "########" ));

        WebElement inputPhoneNumber= Driver.getDriver().findElement( By.xpath("//input[@name='phone']"  ) );
        inputPhoneNumber.sendKeys( faker.numerify( "###-###-####" ) );

        WebElement inputGender= Driver.getDriver().findElement( By.xpath("//input[@value='female']"  ) );
        inputGender.click();

        Select departmentDropdown= new Select( Driver.getDriver().findElement(By.xpath( "//select[@name='department']" )) );
        departmentDropdown.selectByIndex( faker.number().numberBetween(1,9));
        




















    }


}
