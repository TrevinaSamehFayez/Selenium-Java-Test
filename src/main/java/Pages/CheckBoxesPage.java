package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxesPage {

    private WebDriver driver;
    private By checkBoxOne = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
    private By checkBoxTwo = By.xpath("//*[@id=\"checkboxes\"]/input[2]");

    public CheckBoxesPage(WebDriver driver){
        this.driver = driver;
    }

    public Boolean checkBoxTwoSelected(){
        return driver.findElement(checkBoxTwo).isSelected();
    }

    public Boolean checkBoxOneUnSelected(){
        return driver.findElement(checkBoxOne).isSelected();
    }
}
