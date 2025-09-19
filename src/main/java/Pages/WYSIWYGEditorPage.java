package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    private WebDriver driver;
    private String frameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextAreaContent(){
        switchToFrame();
        driver.findElement(textArea).clear();
    }

    public String getText(String text){
        driver.findElement(textArea).sendKeys(text);
        return driver.findElement(textArea).getText();
    }
    private void switchToFrame(){
        driver.switchTo().frame(frameID);
    }
}