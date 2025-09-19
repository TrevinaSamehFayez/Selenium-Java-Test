package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private ChromeDriver driver;

    public HomePage(ChromeDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public AddAndRemoveElements clickAddAndRemove(){
        clickLink("Add/Remove Elements");
        return new AddAndRemoveElements(driver);
    }

    public ChallengingDom clickChallengingDom(){
        clickLink("Challenging DOM");
        return new ChallengingDom(driver);
    }

    public CheckBoxesPage clickCkeckboxes(){
        clickLink("Checkboxes");
        return new CheckBoxesPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public DragAndDropPage clickDragAndDrop(){
        clickLink("Drag and Drop");
        return new DragAndDropPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public DynamicContentPage clickDynamicContent(){
        clickLink("Dynamic Content");
        return new DynamicContentPage(driver);
    }

    public DynamicControlPage clickDynamicControl(){
        clickLink("Dynamic Controls");
        return new DynamicControlPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public GeolocationPage clickGeolocation(){
        clickLink("Geolocation");
        return new GeolocationPage(driver);
    }

    public BasicAuthenticationPage clickBasicAuth(){
        clickLink("Basic Auth");
        return new BasicAuthenticationPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }

    public ExitIntentPage clickExitIntent(){
        clickLink("Exit Intent");
        return new ExitIntentPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public FramesPage clickFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public NotificationMessagesPage clickNotificationsPage(){
        clickLink("Notification Messages");
        return new NotificationMessagesPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }

    public JsAlertsPage clickJsAlerts(){
        clickLink("JavaScript Alerts");
        return new JsAlertsPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOM(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public WYSIWYGEditorPage clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }

    public void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();

    }
}
