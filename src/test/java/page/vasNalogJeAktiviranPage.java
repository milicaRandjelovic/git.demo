package page;

import base.baseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class vasNalogJeAktiviranPage extends baseHalo {
    public vasNalogJeAktiviranPage(){

        PageFactory.initElements(driver, this);
    }
    @FindBy(css = ".regsitration-success")
    WebElement aktiviranNalogMessage;

    public boolean aktiviranNalogMessageIsDisplayed(){
        wdwait.until(ExpectedConditions.visibilityOf(aktiviranNalogMessage));
        return aktiviranNalogMessage.isDisplayed();
    }
    public String aktivirajNalogmMessageText(){
        wdwait.until(ExpectedConditions.visibilityOf(aktiviranNalogMessage));
        return aktiviranNalogMessage.getText();
    }
    public void moveToNewTab(){
        wdwait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
