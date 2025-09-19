package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class GoogleMapPage {

    private ChromeDriver driver;

    public GoogleMapPage(ChromeDriver driver){
        this.driver = driver;
    }

    public String getGPS(){
        return driver.findElement(
                By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[1]/h1/span[2]")).getText();

    }
}
