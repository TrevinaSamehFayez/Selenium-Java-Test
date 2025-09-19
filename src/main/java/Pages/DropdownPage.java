package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {

    private WebDriver driver;
    private By dropDownList = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public Select getDropDown(){
        return new Select(driver.findElement(dropDownList));
    }

    public String selectFromDropDown(String optionName){

        Select dropdown = getDropDown();
        dropdown.selectByVisibleText(optionName);

        return dropdown.getFirstSelectedOption().getText();
    }

    public int getOptionsSize(){
        return getDropDown().getAllSelectedOptions().size();
    }
}
