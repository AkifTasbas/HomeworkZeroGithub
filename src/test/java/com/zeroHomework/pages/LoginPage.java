package com.zeroHomework.pages;


import com.zeroHomework.utilities.ConfigurationReader;
import com.zeroHomework.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    public void login(){
        String username= ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();


    }
}
