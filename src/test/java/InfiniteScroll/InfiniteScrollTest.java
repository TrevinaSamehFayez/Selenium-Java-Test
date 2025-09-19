package InfiniteScroll;

import Base.BaseTests;
import Pages.InfiniteScrollPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InfiniteScrollTest extends BaseTests {


    @Test
    public void testInfiniteScroll() {
        int number = 5;
        InfiniteScrollPage scrollPage = homePage.clickInfiniteScroll();

        scrollPage.scrollToParagraph(number);

        assertEquals(scrollPage.getNumberOfParagraphs(), number);
    }
}
