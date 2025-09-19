package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {

    private WebDriver driver;
    private By columnA = By.id("column-a");
    private By columnB = By.id("column-b");

    public DragAndDropPage(WebDriver driver){
        this.driver = driver;
    }

    public void dragColumnA(){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(columnA), driver.findElement(columnB)).perform();
    }

    public String getColumnBText(){
        return driver.findElement(columnB).getText();
    }
}
