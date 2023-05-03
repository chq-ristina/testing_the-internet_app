package Dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        //want to assert list only has 1 item and that it has the text of option 1
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selection");
        assertTrue(selectedOptions.contains(option), "Option not selected");

    }
}
