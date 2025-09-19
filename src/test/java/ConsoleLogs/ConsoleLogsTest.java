package ConsoleLogs;

import Base.BaseTests;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v137.log.Log;
import org.testng.annotations.Test;

public class ConsoleLogsTest extends BaseTests {

    @Test
    public void testConsoleLogs(){
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Log.enable());

        devTools.addListener(Log.entryAdded(), logEntry -> {
            System.out.println("----------");
            System.out.println("Level: " + logEntry.getLevel());
            System.out.println("Text: " + logEntry.getText());
            System.out.println("Broken URL: " + logEntry.getUrl());
        });

        driver.get("http://the-internet.herokuapp.com/broken_images");
    }
}
