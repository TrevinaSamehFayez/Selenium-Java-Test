package JsAlerts;

import Base.BaseTests;
import Pages.JsAlertsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JsAlertsTest extends BaseTests {

    @Test
    public void testJsAlerts(){

        JsAlertsPage jsAlerts = homePage.clickJsAlerts();

        jsAlerts.clickjsAlert();
        assertEquals(jsAlerts.alertText(), "I am a JS Alert");

        jsAlerts.acceptAlert();
        assertEquals(jsAlerts.getResult(), "You successfully clicked an alert");
    }

    @Test
    public void testJsConfirm(){

        JsAlertsPage jsConfirm = homePage.clickJsAlerts();

        jsConfirm.clickjsConfirm();
        assertEquals(jsConfirm.alertText(), "I am a JS Confirm");

        jsConfirm.cancelAlert();
        assertEquals(jsConfirm.getResult(), "You clicked: Cancel");
    }

    @Test
    public void testJsPrompt(){

        String prompt = "Hello";

        JsAlertsPage jsPrompt = homePage.clickJsAlerts();

        jsPrompt.clickjsPrompt();
        assertEquals(jsPrompt.alertText(), "I am a JS prompt");

        jsPrompt.cancelAlert();
        assertEquals(jsPrompt.getResult(), "You entered: null");

        jsPrompt.clickjsPrompt();
        jsPrompt.sendKeysToPrompt(prompt);
        jsPrompt.acceptAlert();
        assertTrue(jsPrompt.getResult().contains("You entered: "+prompt));
    }
}
