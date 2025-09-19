package Login;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.SecurePage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class LoginTest extends BaseTests {

    @Test
    public void testLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();

        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.clickLogin();

        assertEquals(securePage.getSecureMessage(),"You logged into a secure area!\n" +
                "×");
    }


}
