package tests.forms;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicHobbyCheckbox();
        formsPage.unClickReadingHobbyCheckbox();

        boolean isReadingHobbyCheckboxSelected = formsPage.isReadingHobbyCheckboxSelected();
        Assert.assertFalse(isReadingHobbyCheckboxSelected, "\n Reading Hobby Checkbox Is Selected \n");
    }
}