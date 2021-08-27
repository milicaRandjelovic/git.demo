package page;

import base.baseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloHomePage extends baseHalo {
    public haloHomePage(){

        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".cookie-policy-btn")
    WebElement uReduButton;
    @FindBy(linkText = "Uloguj se")
    WebElement loginDugme;
    @FindBy(linkText = "Registrujte se →")
    WebElement registrujSeDugme;

    public void clickOnUReduButton(){
        wdwait.until(ExpectedConditions.visibilityOf(uReduButton));
        uReduButton.click();
    }
    public void clickOnLoginButton(){
        wdwait.until(ExpectedConditions.visibilityOf(loginDugme));
        loginDugme.click();
    }
    public void clickOnRegistrationButton(){
        wdwait.until(ExpectedConditions.visibilityOf(registrujSeDugme));
        registrujSeDugme.click();
    }
}
