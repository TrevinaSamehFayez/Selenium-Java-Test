package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChallengingDom {

    private WebDriver driver;
    private By fooButton = By.cssSelector(".button");

    public ChallengingDom(WebDriver driver){
        this.driver = driver;
    }

    public String getButtonText() {

        return driver.findElement(fooButton).getText();
    }

    public void clickButton() {

        driver.findElement(fooButton).click();
    }

    public String getAnswer() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(driver -> js.executeScript("return window._answer") != null);
        return (String) js.executeScript("return window._answer");
    }
}
