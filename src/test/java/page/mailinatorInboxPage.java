package page;

import base.baseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorInboxPage extends baseHalo {
    public mailinatorInboxPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//td[contains(text(), \"Molimo aktivirajte\")]")
    WebElement haloOglasiEmail;
    public void clickOnHaloOglasiEmail(){
        wdwait.until(ExpectedConditions.visibilityOf(haloOglasiEmail));
        haloOglasiEmail.click();
    }
}
