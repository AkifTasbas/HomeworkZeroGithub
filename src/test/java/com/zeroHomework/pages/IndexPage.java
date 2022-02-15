package com.zeroHomework.pages;


import com.zeroHomework.utilities.ConfigurationReader;
import com.zeroHomework.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

    public IndexPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    String url= ConfigurationReader.get("url");

    @FindBy(xpath = "//button[@id='signin_button']")
    private WebElement signinButton;

    public void signinButtonClick(){

        WebDriver driver=Driver.get();
        driver.get(url);
        driver.manage().window().maximize();

        signinButton.click();
    }

}

