package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class MultipleWindowsPage {

    private WebDriver driver;
    private By header = By.tagName("h3");

    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }


    public void openNewTab(String url) {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
    }

    public String getHeaderText() {
        return driver.findElement(header).getText();
    }




}
