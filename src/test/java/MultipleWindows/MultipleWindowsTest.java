package MultipleWindows;

import Base.BaseTests;
import Pages.MultipleWindowsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MultipleWindowsTest extends BaseTests {

    @Test
    public void testMultipleWindows(){
        MultipleWindowsPage multipleWindows = homePage.clickMultipleWindows();

        multipleWindows.openNewTab("https://the-internet.herokuapp.com/windows/new");
        assertEquals(multipleWindows.getHeaderText(), "New Window");
    }
}
