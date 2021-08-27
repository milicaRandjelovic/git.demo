package tests;

import base.baseHalo;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import page.*;

import java.util.Random;

public class testsHalo extends baseHalo {
    haloHomePage HaloHomePage;
    haloRegistrationSuccessPage HaloRegistrationSuccessPage;
    mailinatorEmailPage MailinatorEmailPage;
    mailinatorHomePage MailinatorHomePage;
    mailinatorInboxPage MailinatorInboxPage;
    registrationPage RegistrationPage;
    vasNalogJeAktiviranPage VasNalogJeAktiviranPage;

    Random random = new Random();
    int x = random.nextInt(999999);
    String username = "ygbcdsdgvcsg" +x;
    String email = x+ "@mailinator.com";


    @Before
    public void setUpTest(){
        HaloHomePage = new haloHomePage();
        HaloRegistrationSuccessPage = new haloRegistrationSuccessPage();
        MailinatorEmailPage = new mailinatorEmailPage();
        MailinatorHomePage = new mailinatorHomePage();
        MailinatorInboxPage = new mailinatorInboxPage();
        RegistrationPage = new registrationPage();
        VasNalogJeAktiviranPage = new vasNalogJeAktiviranPage();

    }
    @Test
    public void haloOglasiRegistrationTest(){
        HaloHomePage.clickOnUReduButton();
        HaloHomePage.clickOnLoginButton();
        HaloHomePage.clickOnRegistrationButton();
        RegistrationPage.enterUsername(username);
        RegistrationPage.enterEmail(email);
        RegistrationPage.enterPassword("12345678");
        RegistrationPage.enterConfirmPassword("12345678");
        RegistrationPage.clickRegistrationButton();
        assertTrue(HaloRegistrationSuccessPage.registrationSuccessMessageIsDisplayed());
        assertEquals( "Registracija je uspela!\n" +
                "Kako bi Vaš nalog postao aktivan, neophodno je da kliknite na link u mejlu koji Vam je poslat na : " +email+ " !", HaloRegistrationSuccessPage.registrationSuccessMessageText());
        driver.get("https://www.mailinator.com/");
        MailinatorHomePage.inputEmailIntoMailinatorInputField(email);
        MailinatorHomePage.clickEnterMailinator();
        MailinatorInboxPage.clickOnHaloOglasiEmail();
        MailinatorEmailPage.switchToIFrameAndClickToAktivirajNalogLink();
        VasNalogJeAktiviranPage.moveToNewTab();
        assertTrue(VasNalogJeAktiviranPage.aktiviranNalogMessageIsDisplayed());
        assertEquals("Vaš nalog je uspešno aktiviran!\n" +
                "Produžite na stranicu za logovanje kako biste pristupili našem portalu. Prijava", VasNalogJeAktiviranPage.aktivirajNalogmMessageText());


    }
}
