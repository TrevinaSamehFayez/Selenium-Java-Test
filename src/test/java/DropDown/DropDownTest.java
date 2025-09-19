package DropDown;

import Base.BaseTests;
import Pages.DropdownPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTests {

    @Test
    public void testDropDown(){

        DropdownPage dropDown = homePage.clickDropDown();
        String option = "Option 1";
        assertEquals(dropDown.selectFromDropDown(option), "Option 1");
        assertEquals(dropDown.getOptionsSize(), 1);
    }
}
