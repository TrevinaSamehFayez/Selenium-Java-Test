package ExitIntent;

import Base.BaseTests;
import Pages.ExitIntentPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ExitIntentTest extends BaseTests {

    @Test
    public void testExitIntent(){

        ExitIntentPage exitIntent = homePage.clickExitIntent();
        exitIntent.moveCursor();
        assertTrue(exitIntent.getModalText().contains("It's commonly used to encourage a user to take an action"));
    }
}
