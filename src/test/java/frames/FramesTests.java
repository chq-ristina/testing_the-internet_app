package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndentation();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text from editor is incorrect");
    }

    @Test
    public void testNestedFrames(){
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();

        assertEquals(nestedFramesPage.getBottomText(), "BOTTOM", "Bottom frame text is incorrect");

        assertEquals(nestedFramesPage.getLeftText(), "LEFT", "Left frame text is incorrect");
    }
}
