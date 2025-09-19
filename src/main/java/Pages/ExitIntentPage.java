package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExitIntentPage {

    private WebDriver driver;
    private By modalElement = By.id("ouibounce-modal");

    public ExitIntentPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveCursor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('ouibounce-modal').style.display='block';");
    }

    public String getModalText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(modalElement));
        return modal.getText();
    }
}

