package BasicAuthentication;

import Base.BaseTests;
import Pages.BasicAuthenticationPage;
import Pages.RegistrationPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BasicAuthenticationTest extends BaseTests {

    @Test
    public void testBasicAuth(){
        BasicAuthenticationPage basicAuth = new BasicAuthenticationPage(driver);

        RegistrationPage registration = basicAuth.sendUserAndPass(
                "admin",
                "admin",
                "https://the-internet.herokuapp.com/basic_auth"
        );

        assertEquals(
                registration.getMessage(),
                "Congratulations! You must have the proper credentials."
        );
    }

}
