package com.zeroHomework.pages;


import com.zeroHomework.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {

    public  AccountSummaryPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public void goToSelectedPageOnAccountSummaryPage(String selecteditemOnAccountSummary){
        WebElement selectedOnAccountSummaryPage=Driver.get().findElement(By.xpath("//a[.='"+selecteditemOnAccountSummary+"']"));
        selectedOnAccountSummaryPage.click();
    }


}
