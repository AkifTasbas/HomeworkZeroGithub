package com.zeroHomework.step_definitions;


import com.zeroHomework.pages.*;
import com.zeroHomework.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityNavigationStepsDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        IndexPage indexPage=new IndexPage();
        indexPage.signinButtonClick();
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        Driver.get().navigate().back();
    }

    @Then("go to {string}")
    public void go_to(String homePageTabName) {
        HomePage homePage=new HomePage();
        homePage.homePageTabClick(homePageTabName);
    }

    @Then("select {string} in Online Banking Page")
    public void select_in_Online_Banking_Page(String selectedPageName) {
        OnlineBankingPage onlineBankingPage=new OnlineBankingPage();
        onlineBankingPage.goToSelectedPageInOnlineBanking(selectedPageName);
    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String selecteditemOnAccountSummary) {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.goToSelectedPageOnAccountSummaryPage(selecteditemOnAccountSummary);
    }

    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String tabText) {
        WebElement tab=Driver.get().findElement(By.xpath("//a[.='"+tabText+"']"));
        String actualTabText=tab.getText();
        String expectedTabText=tabText;
        Assert.assertEquals(actualTabText,expectedTabText);
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String selectedOption) {
        WebElement accountDropdown=Driver.get().findElement(By.xpath("//select[@id='aa_accountId']"));
        Select accountDropdownOptions=new Select(accountDropdown);
       // List<WebElement> options=accountDropdownOptions.getOptions();
       String actualSelectedText=accountDropdownOptions.getFirstSelectedOption().getText();
       String expectedSelectedText=selectedOption;
       Assert.assertEquals(actualSelectedText,expectedSelectedText);

    }





















}
