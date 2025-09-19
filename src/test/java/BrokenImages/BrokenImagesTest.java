package BrokenImages;

import Base.BaseTests;
import org.openqa.selenium.devtools.DevTools;

import org.testng.annotations.Test;

import org.openqa.selenium.devtools.v139.log.Log;
import org.openqa.selenium.devtools.v139.runtime.Runtime;


public class BrokenImagesTest extends BaseTests {

    @Test
    public void testViewBrowserConsoleLogs(){
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        devTools.send(Log.enable());
        devTools.send(Runtime.enable());
        devTools.addListener(Log.entryAdded(), LogEntry ->{
            System.out.println("----------");
            System.out.println("Level: "+LogEntry.getLevel());
            System.out.println("Text: "+LogEntry.getText());
            System.out.println("Broken Url: "+LogEntry.getUrl());
        });
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }
}
