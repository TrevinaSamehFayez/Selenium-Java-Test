package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecurePage {

    private ChromeDriver driver;
    private By secureMsg = By.id("flash");

    public SecurePage(ChromeDriver driver){
        this.driver = driver;
    }

    public String getSecureMessage(){
        return driver.findElement(secureMsg).getText();
    }


}
