package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private WebDriver driver;
    private By message = By.tagName("p");

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public String getMessage(){
        return driver.findElement(message).getText();
    }
}
