package tests.modals;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog() {
        var alertsFramesWindowsPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogPage = alertsFramesWindowsPage.clockModalDialogs();
        modalDialogPage.clickSmallModalButton();
        String actualText = modalDialogPage.getSmallModalText();

        Assert.assertTrue(actualText.contains("small modal"),
                "\n The message Does Not Contain 'small modal' \n");

        modalDialogPage.clickCloseButton();
    }
}