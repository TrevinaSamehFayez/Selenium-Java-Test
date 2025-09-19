package DynamicControls;

import Base.BaseTests;
import Pages.DynamicControlPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DynamicControlsTest extends BaseTests {

    @Test
    public void testDynamicControls(){

        DynamicControlPage dynamicControl = homePage.clickDynamicControl();

        assertEquals(dynamicControl.getRemoveButtonText(), "Add");
        assertEquals(dynamicControl.getMessage(), "It's gone!");
    }

    @Test
    public void testFieldisEnabld(){
        DynamicControlPage dynamicControl = homePage.clickDynamicControl();
        assertTrue(dynamicControl.inputFieldisEnabled());
    }
}
