package com.zeroHomework.step_definitions;

import com.zeroHomework.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindTransactionsStepsDefs {

    @Then("the user accesses the {string} tab")
    public void the_user_accesses_the_tab(String accountActivityTabName) {
        WebElement accountActivityTab= Driver.get().findElement(By.xpath("//a[.='"+accountActivityTabName+"']"));
        accountActivityTab.click();
    }

    @Then("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String fromDate, String toDate) {
        WebElement fromDateInput=Driver.get().findElement(By.xpath("//input[@id='aa_fromDate']"));
        WebElement toDateInput=Driver.get().findElement(By.xpath("//input[@id='aa_toDate']"));

        fromDateInput.clear();
        fromDateInput.sendKeys(fromDate);
        toDateInput.clear();
        toDateInput.sendKeys(toDate);
    }

    @Then("clicks search")
    public void clicks_search() {
        System.out.println("SIMDI CLIK YAPIYORUM");
        WebElement findButton=Driver.get().findElement(By.xpath("//button[@type='submit']"));
        findButton.click();
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String fromDate, String toDate) throws ParseException {
        List<WebElement> tableRows=Driver.get().findElements(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr"));
        System.out.println("tableRows.size() = " + tableRows.size());
        List<WebElement> tableColumns=Driver.get().findElements(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr[1]//td"));
        System.out.println("tableColumns.size() = " + tableColumns.size());

       List<Date> dates=new ArrayList<>();
       for (int i = 1; i <tableRows.size(); i++) {
            WebElement dateElement=Driver.get().findElement(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr["+i+"]//td[1]"));
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(dateElement.getText());
            dates.add(date);
        }


        Date fromRealDate=new SimpleDateFormat("yyyy-MM-dd").parse(fromDate);
        Date toRealDate=new SimpleDateFormat("yyyy-MM-dd").parse(toDate);

        for (Date date : dates) {
            if ((date.compareTo(fromRealDate)==1 || date.compareTo(fromRealDate)==0)&&(date.compareTo(toRealDate)==-1||date.compareTo(toRealDate)==0)) {
                System.out.println("date = " + date+" Date araliktadir");
                Assert.assertTrue(true);
            }else{
                System.out.println("date = " + date+" Date aralikta degildir");
                Assert.assertTrue(false);
            }
        }

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() throws ParseException {
        List<WebElement> tableRows=Driver.get().findElements(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr"));
        System.out.println("tableRows.size() = " + tableRows.size());
        List<WebElement> tableColumns=Driver.get().findElements(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr[1]//td"));
        System.out.println("tableColumns.size() = " + tableColumns.size());

        List<Date> dates=new ArrayList<>();
        for (int i = 1; i <tableRows.size(); i++) {
            WebElement dateElement=Driver.get().findElement(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr["+i+"]//td[1]"));
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(dateElement.getText());
            dates.add(date);
        }
        for (int i = 0; i < dates.size()-1; i++) {
            if(dates.get(i).compareTo(dates.get(i+1))==1){
                Assert.assertTrue(true);
            }else {
                Assert.assertTrue(false);
            }


        }


        }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String notContainedDate) throws ParseException {
        Date controlDate=new SimpleDateFormat("yyyy-MM-dd").parse(notContainedDate);
        List<WebElement> tableRows=Driver.get().findElements(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr"));
        System.out.println("tableRows.size() = " + tableRows.size());
        List<WebElement> tableColumns=Driver.get().findElements(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr[1]//td"));
        System.out.println("tableColumns.size() = " + tableColumns.size());



        List<Date> dates=new ArrayList<>();
        for (int i = 1; i <tableRows.size(); i++) {
            WebElement dateElement=Driver.get().findElement(By.xpath("(//table[@class='table table-condensed table-hover'])[2]//tr["+i+"]//td[1]"));
            Date date=new SimpleDateFormat("yyyy-MM-dd").parse(dateElement.getText());
            dates.add(date);
        }

        for (Date date : dates) {
           Assert.assertFalse(date.compareTo(controlDate)==0);

        }
    }



}






