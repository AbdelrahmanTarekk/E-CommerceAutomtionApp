package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_LoginPage {
    public P02_LoginPage(){
        PageFactory.initElements(Hooks.driver,this);
    }
    @FindBy(linkText = "Log in")
    public WebElement loginBTN;
    @FindBy(id="Email")
    public WebElement emailTF;
    @FindBy(name = "Password")
    public WebElement passTF;

    @FindBy(css ="button.button-1.login-button")
    public WebElement loginButton;

    @FindBy(linkText = "My account")
    public WebElement myAccBTN;
    @FindBy(css = "div.message-error.validation-summary-errors")
    public WebElement unloggedMSG;

}
