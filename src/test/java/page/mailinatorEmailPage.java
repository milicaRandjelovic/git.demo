package page;

import base.baseHalo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class mailinatorEmailPage extends baseHalo {
    public mailinatorEmailPage() {

        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "html_msg_body")
    WebElement iFrameBody;
    @FindBy(linkText = "Aktiviraj nalog")
    WebElement aktivirajNalogLink;

    public void switchToIFrameAndClickToAktivirajNalogLink(){
        driver.switchTo().frame(iFrameBody);
        wdwait.until(ExpectedConditions.visibilityOf(aktivirajNalogLink));
        aktivirajNalogLink.click();
        driver.switchTo().defaultContent();
    }
}
