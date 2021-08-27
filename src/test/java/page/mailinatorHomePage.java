package page;

import base.baseHalo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorHomePage extends baseHalo {
    public mailinatorHomePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "addOverlay")
    WebElement mailinatorInputField;
    public void inputEmailIntoMailinatorInputField(String email){
        wdwait.until(ExpectedConditions.visibilityOf(mailinatorInputField));
        mailinatorInputField.clear();
        mailinatorInputField.sendKeys(email);
    }
    public void clickEnterMailinator(){
        wdwait.until(ExpectedConditions.visibilityOf(mailinatorInputField));
        mailinatorInputField.sendKeys(Keys.ENTER);
    }
}
