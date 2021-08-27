package page;

import base.baseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class haloRegistrationSuccessPage extends baseHalo {
    public haloRegistrationSuccessPage(){

        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".regsitration-success")
    WebElement registrationSuccessMessage;

    public boolean registrationSuccessMessageIsDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationSuccessMessage));
        return registrationSuccessMessage.isDisplayed();
    }
    public String registrationSuccessMessageText(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationSuccessMessage));
        return registrationSuccessMessage.getText();
    }
}
