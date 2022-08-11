package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;

public class D03_currenciesStepDef {
    P03_homePage currancy= new P03_homePage();
    @When("user select euro currency")
    public void user_select_euro_currency() throws InterruptedException {currancy.SelectCurrency();}
    @Then("categories will be changed to the currency symbol")
    public void user_can_find_euro_symbol(){currancy.CurrencySymol();}

}
