package NotificationPage;

import Base.BaseTests;
import Pages.NotificationMessagesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NotificationPageTest extends BaseTests {

    @Test
    public void testNotificationsPage(){
        NotificationMessagesPage notification = homePage.clickNotificationsPage();

        Assert.assertTrue(notification.getNotificationText().contains("Action successful")
                        || notification.getNotificationText().contains("Action unsuccesful, please try again")
                        || notification.getNotificationText().contains("Action unsuccessful"),
                "Unexpected notification");
    }
}
