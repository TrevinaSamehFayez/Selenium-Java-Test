package ChallengingDom;

import Base.BaseTests;
import Pages.ChallengingDom;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChallengingDomTest extends BaseTests {

    @Test
    public void testChallengingDom(){

        ChallengingDom challengingDom = homePage.clickChallengingDom();

        String oldText = challengingDom.getButtonText();
//        String oldAnswer = challengingDom.getAnswer();

        challengingDom.clickButton();

        String newText = challengingDom.getButtonText();
//        String newAnswer = challengingDom.getAnswer();

        Assert.assertNotEquals(oldText, newText);
//        Assert.assertNotEquals(oldAnswer, newAnswer);
    }
}
