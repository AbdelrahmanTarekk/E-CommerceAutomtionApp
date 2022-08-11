package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.dom.model.RGBA;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Optional;

public class D01_registerStepDef {

    P01_RegisterPage registerPage = new P01_RegisterPage();

    @Given("user go to register page")
    public void register_page(){
    registerPage.registerBtn.click();
    }

    @And("user select gender type")
    public void selectGNDR(){
    registerPage.genderRBtn.click();
    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void ENTRfullname(){
    registerPage.fname.sendKeys("automation");
    registerPage.lname.sendKeys("tester");
    }

    Select selectObj = null;
    @And("user enter date of birth")
    public void ENTRdate(){

    selectObj= new Select(registerPage.dayDropDownList);
    selectObj.selectByValue("15");
    selectObj= new Select(registerPage.monthDropDownList);
    selectObj.selectByIndex(11);
    selectObj= new Select(registerPage.yearDropDownList);
    selectObj.selectByVisibleText("1998");
    }

    @And("user enter email \"test@example.com\" field")
    public void enterEmail(){
    registerPage.emailFeild.sendKeys("test1@example.com");
    }

    @And("user fills Password fields \"P@ssw0rd\" \"Password\"")
    public void enterPass(){
        registerPage.passFeild.sendKeys("P@ssw0rd");
        registerPage.confpassFeild.sendKeys("P@ssw0rd");
    }
    @And("user clicks on register button")

    public void regBTN_click(){
        registerPage.regBTN.click();
    }
    SoftAssert ass =new SoftAssert();
    @Then("success message is displayed")
    public void succesMSG(){
        ass.assertTrue(registerPage.sucssMSG.getText().contains("Your registration completed"));
        ass.assertEquals(registerPage.sucssMSG.getCssValue("color"),new RGBA(76, 177, 124, Optional.of(1)));
    }
}
