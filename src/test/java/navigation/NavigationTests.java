package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testDynamicLoadingNewTab(){
        var example2 = homePage.clickDynamicLoading().clickExample2NewTab();
        getWindowManager().switchToNewTab();
        assertEquals(example2.getStartButtonText(), "Start", "Did not correctly switch to new tab");
    }
}
