package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LoginPage;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {

    P02_LoginPage loginPage = new P02_LoginPage();

    @Given("user go to login page")
    public void navtologin(){
        loginPage.loginBTN.click();
    }
    @When("user login with \"valid\" \"test1@example.com\" and \"P@ssw0rd\"")
    public void vaildData(){
    loginPage.emailTF.sendKeys("test@example.com");
    loginPage.passTF.sendKeys("P@ssw0rd");
    }
    @And("user press on login button")
    public void loginBtnClick(){
    loginPage.loginButton.click();
    }
    SoftAssert ass =new SoftAssert();
    @Then("user login to the system successfully")
    public void logedSuccessfully(){
    ass.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    ass.assertEquals(loginPage.myAccBTN.getText(),"My account");
    }

    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void invaildData(){
        loginPage.emailTF.sendKeys("wrong@example.com");
        loginPage.passTF.sendKeys("P@ssw0rd");
    }

    @Then("user could not login to the system")
    public void unlogedSuccessfully(){
        ass.assertTrue(loginPage.unloggedMSG.getText().contains("Login was unsuccessful."));
        ass.assertEquals(loginPage.unloggedMSG.getCssValue("color"),
                Color.fromString("rgba(228, 67, 75, 1)").asHex());
    }



}
