package pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends AlertsFramesWindowsPage {
    private final By informationAlertButton = By.id("alertButton");

    public void clickInformationAlertButton() {
        click(informationAlertButton);
    }
}