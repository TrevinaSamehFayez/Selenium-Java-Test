package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddAndRemoveElements {

    private WebDriver driver;

    private By addButton = By.cssSelector("div.example>button");
    private By deleteButton = By.className("added-manually");

    public AddAndRemoveElements(WebDriver driver){
        this.driver = driver;
    }

    public String clickAddButton(){
        driver.findElement(addButton).click();
        return driver.findElement(deleteButton).getText();
    }

    public Boolean clickDeleteButton(){
        driver.findElement(deleteButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(deleteButton));
        return true;
    }

}
