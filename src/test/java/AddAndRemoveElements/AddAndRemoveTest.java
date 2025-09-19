package AddAndRemoveElements;

import Base.BaseTests;
import Pages.AddAndRemoveElements;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddAndRemoveTest extends BaseTests {

    @Test
    public void testAddAndRemoveelements(){
        AddAndRemoveElements test = homePage.clickAddAndRemove();
        assertEquals(test.clickAddButton(), "Delete");
        assertTrue(test.clickDeleteButton(), "Delete button still appears");
    }

}
