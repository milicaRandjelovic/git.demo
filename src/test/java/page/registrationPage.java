package page;

import base.baseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class registrationPage extends baseHalo {
    public registrationPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "UserName")
    WebElement usernameField;
    @FindBy(id = "Email")
    WebElement emailField;
    @FindBy(id = "Password")
    WebElement passwordField;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @FindBy(css = ".button-reg.save.save-entity.person-face.btn-main")
    WebElement registrationButton;

    public void enterUsername(String username){
        wdwait.until(ExpectedConditions.visibilityOf(usernameField));
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void enterEmail(String email){
        wdwait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void enterPassword(String password){
        wdwait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void enterConfirmPassword(String password){
        wdwait.until(ExpectedConditions.visibilityOf(confirmPasswordField));
        confirmPasswordField.clear();
        confirmPasswordField.sendKeys(password);
    }
    public void clickRegistrationButton(){
        wdwait.until(ExpectedConditions.visibilityOf(registrationButton));
        registrationButton.click();

    }
}
