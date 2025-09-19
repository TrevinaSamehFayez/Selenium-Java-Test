package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By boxElement = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    private void rightClickBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(boxElement)).perform();
    }

    public String getAlertText(){
        rightClickBox();
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        return alertText;
    }
}
