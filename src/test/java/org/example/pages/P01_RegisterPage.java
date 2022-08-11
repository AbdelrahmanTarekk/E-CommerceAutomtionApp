package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_RegisterPage {
    public P01_RegisterPage(){
    PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(linkText = "Register")
    public WebElement registerBtn;

    @FindBy(css = "input#gender-male")
    public WebElement genderRBtn;

    @FindBy(id = "FirstName")
    public WebElement fname;

    @FindBy(id = "LastName")
    public WebElement lname;

    @FindBy(name = "DateOfBirthDay")
    public WebElement dayDropDownList;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement monthDropDownList;
    @FindBy(name = "DateOfBirthYear")
    public WebElement yearDropDownList;

    @FindBy(id = "Email")
    public WebElement emailFeild;

    @FindBy(id = "Password")
    public WebElement passFeild;
    @FindBy(id="ConfirmPassword")
    public WebElement confpassFeild;

    @FindBy(name="register-button")
    public WebElement regBTN;
    @FindBy(css = "div.result")
    public WebElement sucssMSG;

}
