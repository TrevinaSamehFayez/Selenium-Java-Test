package Base;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;


public class BaseTests {
    protected ChromeDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(getChromeOptions());
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void takeScreenShot(ITestResult result) throws IOException{
        String methodName = result.getMethod().getMethodName();
        File source = driver.getScreenshotAs(OutputType.FILE);
        File screenshotsFolder = new File("src/main/resources/Screenshots/");
        File destination = new File(screenshotsFolder, methodName + ".png");
        FileHandler.copy(source, destination);

    }

    private ChromeOptions getChromeOptions(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);

        return options;
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}