package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {


    public LibraryLoginPage(){

        PageFactory.initElements( Driver.getDriver(),this );
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id="inputPassword")
    public  WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public static WebElement signInButton;

    @FindBy(xpath ="//[.='This field is required.']/div")
    public static WebElement fieldRequiredErrorMessage;

    @FindBy(xpath="//div[.='Sorry,Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;


}
