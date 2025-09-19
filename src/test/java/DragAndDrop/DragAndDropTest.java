package DragAndDrop;

import Base.BaseTests;
import Pages.DragAndDropPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DragAndDropTest extends BaseTests {

    @Test
    public void testDragAndDrop(){

        DragAndDropPage dragAndDrop = homePage.clickDragAndDrop();

        dragAndDrop.dragColumnA();
        assertEquals(dragAndDrop.getColumnBText(), "A");
    }
}
