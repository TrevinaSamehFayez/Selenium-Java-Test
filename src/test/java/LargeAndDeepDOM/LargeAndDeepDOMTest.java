package LargeAndDeepDOM;

import Base.BaseTests;
import Pages.LargeAndDeepDOMPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LargeAndDeepDOMTest extends BaseTests {

    @Test
    public void testScrollToTable(){
        LargeAndDeepDOMPage scroll = homePage.clickLargeAndDeepDOM();
        scroll.scrollToTable();
        assertTrue(scroll.isTableVisible());
    }
}
