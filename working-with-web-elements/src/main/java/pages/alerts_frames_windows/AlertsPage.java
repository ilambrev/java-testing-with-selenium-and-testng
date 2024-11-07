package pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramesWindowsPage {
    private final By informationAlertButton = By.id("alertButton");
    private final By confirmationAlertButton = By.id("confirmButton");
    private final By confirmationResult = By.id("confirmResult");
    private final By promptAlertButton = By.id("promtButton"); // Typo in button id on AUT
    private final By promptResult = By.id("promptResult");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton() {
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }

    public void clickPromptAlertButton() {
        click(promptAlertButton);
    }

    public String getPromptAlertResult() {
        return find(promptResult).getText();
    }
}