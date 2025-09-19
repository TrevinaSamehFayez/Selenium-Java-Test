package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class DynamicControlPage {

    private WebDriver driver;
    private By checkboxElement = By.id("checkbox");
    private By removeButton = By.xpath("//*[@id=\"checkbox-example\"]/button");
    private By message = By.id("message");

    private By enableButton = By.xpath("//*[@id=\"input-example\"]/button");
    private By inputField = By.xpath("//*[@id=\"input-example\"]/input");


    public DynamicControlPage(WebDriver driver){
        this.driver = driver;
    }

    public String getRemoveButtonText(){

        WebElement removeButtonElement = driver.findElement(removeButton);
        removeButtonElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(checkboxElement)));
        return removeButtonElement.getText();
    }

    public String getMessage(){
        return driver.findElement(message).getText();
    }

    public Boolean inputFieldisEnabled(){
        WebElement enableButtonElement = driver.findElement(enableButton);
        enableButtonElement.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(inputField));
        return driver.findElement(inputField).isEnabled();

    }




}
