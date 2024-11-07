package tests.alerts;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

@Test // Every method in the class will be identified as test method
public class AlertsTest extends BaseTest {


    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();

        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual & Expected Messages Do Not Match \n");

        acceptAlert();
    }

    public void testConfirmationAlert() {
        String expectedConfirmationResult = "You selected Cancel";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertsPage.getConfirmationResult();

        Assert.assertEquals(actualConfirmationResult, expectedConfirmationResult,
                "\n You Did Not Select Cancel \n");
    }

    public void testPromptAlert() {
        String alertText = "Joe Doe";
        String expectedResult = "You entered " + alertText;

        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickPromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();

        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual & Expected Results Do Not Match \n");
    }
}