package CheckBoxes;

import Base.BaseTests;
import Pages.CheckBoxesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxesTest extends BaseTests {

    @Test
    public void testCheckboxes(){

        CheckBoxesPage checkboxes = homePage.clickCkeckboxes();

        Assert.assertTrue(checkboxes.checkBoxTwoSelected());
        Assert.assertFalse(checkboxes.checkBoxOneUnSelected());
    }
}
