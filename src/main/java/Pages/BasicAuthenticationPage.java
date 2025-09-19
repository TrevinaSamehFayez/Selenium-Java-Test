package Pages;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;

public class BasicAuthenticationPage {

    private WebDriver driver;

    public BasicAuthenticationPage(WebDriver driver){
        this.driver = driver;
    }

    public RegistrationPage sendUserAndPass(String username, String password, String url){
        ((HasAuthentication) driver).register(UsernameAndPassword.of(username, password));
        driver.get(url);
        return new RegistrationPage(driver);
    }
}
