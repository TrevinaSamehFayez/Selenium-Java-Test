package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private ChromeDriver driver;
    private By usernameElement = By.id("username");
    private By passwordElement = By.id("password");
    private By submitButton = By.cssSelector("#login button");

    public LoginPage(ChromeDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameElement).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordElement).sendKeys(password);
    }

    public SecurePage clickLogin(){
        driver.findElement(submitButton).click();
        return new SecurePage(driver);
    }
}
