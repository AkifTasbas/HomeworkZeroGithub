package com.zeroHomework.pages;


import com.zeroHomework.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OnlineBankingPage {

    public OnlineBankingPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void goToSelectedPageInOnlineBanking(String selectedPageName){

        WebElement selectedPageTab=Driver.get().findElement(By.xpath("//span[.='"+selectedPageName+"']"));
        selectedPageTab.click();

    }



}

