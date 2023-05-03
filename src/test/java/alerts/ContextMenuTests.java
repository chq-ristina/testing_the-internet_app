package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClick();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu", "Alert text was incorrect");
        contextMenuPage.alert_clickToAccept();
    }
}
