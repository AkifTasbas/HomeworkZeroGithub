package com.zeroHomework.pages;


import com.zeroHomework.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(),this);

    }
    public void homePageTabClick(String homePageTab){
        WebElement homePageTabName=Driver.get().findElement(By.xpath("//strong[text()='"+homePageTab+"']"));
        homePageTabName.click();

    }

}
