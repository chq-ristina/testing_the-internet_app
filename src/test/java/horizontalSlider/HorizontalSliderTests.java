package horizontalSlider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void slideToValue(){
        var horizontalSliderPage = homePage.clickHorizontalSlider();
        horizontalSliderPage.clickOnSlider();
        horizontalSliderPage.moveSlider(4);
        assertEquals(horizontalSliderPage.getSliderAmount(), "4", "Incorrect slider amount");
    }
}
