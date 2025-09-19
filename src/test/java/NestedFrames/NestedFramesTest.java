package NestedFrames;

import Base.BaseTests;
import Pages.NestedFramesPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTests {

    @Test
    public void testNestedFrames(){
        NestedFramesPage nestedFrames = homePage.clickFrames().clickNestedFrames();


        assertEquals(nestedFrames.getLeftFrameContent(), "LEFT");
        assertEquals(nestedFrames.getMiddleFrameContent(), "MIDDLE");
        assertEquals(nestedFrames.getRightFrameContent(), "RIGHT");
        assertEquals(nestedFrames.getBottomFrameContent(), "BOTTOM");
    }
}
