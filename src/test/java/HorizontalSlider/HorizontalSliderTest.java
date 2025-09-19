package HorizontalSlider;

import Base.BaseTests;
import Pages.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTest extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        String x = "4";
        HorizontalSliderPage slider = homePage.clickHorizontalSlider();

        slider.moveSlider(x);
        assertEquals(slider.getRangeValue(), x);
    }


}
