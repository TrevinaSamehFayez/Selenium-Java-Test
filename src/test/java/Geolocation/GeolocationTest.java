package Geolocation;

import Base.BaseTests;
import Pages.GeolocationPage;
import Pages.GoogleMapPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class GeolocationTest extends BaseTests {

    @Test
    public void testGeolocation(){

        GeolocationPage geolocation = homePage.clickGeolocation();
        Map<String, Object> coordinates = new HashMap<String, Object>() {{
            put("latitude", 29.9761664);
            put("longitude", 31.2475648);
            put("accuracy", 1);
        }};

        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
        geolocation.clickWhereAmI();
        GoogleMapPage gps = geolocation.clickSeeItButton();

        assertEquals(gps.getGPS(), "29°58'34.2\"N 31°14'51.2\"E");
    }
}
