package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {

    private WebDriver driver;

    // Frame locators
    private By topFrame = By.name("frame-top");
    private By bottomFrame = By.name("frame-bottom");
    private By leftFrame = By.name("frame-left");
    private By middleFrame = By.name("frame-middle");
    private By rightFrame = By.name("frame-right");

    private By frameText = By.tagName("body");

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftFrameContent(){
        driver.switchTo().frame(driver.findElement(topFrame));
        driver.switchTo().frame(driver.findElement(leftFrame));
        String text = getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getMiddleFrameContent(){
        driver.switchTo().frame(driver.findElement(topFrame));
        driver.switchTo().frame(driver.findElement(middleFrame));
        String text = getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getRightFrameContent(){
        driver.switchTo().frame(driver.findElement(topFrame));
        driver.switchTo().frame(driver.findElement(rightFrame));
        String text = getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public String getBottomFrameContent(){
        driver.switchTo().frame(driver.findElement(bottomFrame));
        String text = getText();
        driver.switchTo().defaultContent();
        return text;
    }

    private String getText(){
        return driver.findElement(frameText).getText();
    }
}
