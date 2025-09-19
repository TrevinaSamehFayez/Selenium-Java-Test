package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class GeolocationPage {

    private ChromeDriver driver;
    private By seeItButton = By.xpath("//*[@id=\"map-link\"]/a");

    public GeolocationPage(ChromeDriver driver){
        this.driver = driver;
    }

    public GoogleMapPage clickSeeItButton(){
        driver.findElement(seeItButton).click();
        return new GoogleMapPage(driver);
    }

    public void clickWhereAmI(){
        WebElement divContent = driver.findElement(By.id("content"));
        WebElement button = driver.findElement(RelativeLocator.with(By.tagName("button")).near(divContent));
        button.click();
    }
}
