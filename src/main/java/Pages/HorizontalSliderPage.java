package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By sliderElement = By.xpath("//*[@id=\"content\"]/div/div/input");
    private By rangeElement = By.id("range");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void moveSlider(String value){
        WebElement slider = driver.findElement(sliderElement);

        while (!getRangeValue().equals(value)) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getRangeValue(){
        return driver.findElement(rangeElement).getText();
    }
}
