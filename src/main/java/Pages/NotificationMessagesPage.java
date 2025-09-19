package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class NotificationMessagesPage {

    private WebDriver driver;
    private By button = By.linkText("Click here");

    public NotificationMessagesPage(WebDriver driver){
        this.driver = driver;
    }


    public String getNotificationText(){
        driver.findElement(button).click();

        WebElement notificationElement = driver.findElement(
                RelativeLocator.with(By.tagName("div")).above(driver.findElement(button)));

        return notificationElement.getText();
    }
}
