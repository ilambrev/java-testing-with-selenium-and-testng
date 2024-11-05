package pages.alerts_frames_windows;

import org.openqa.selenium.By;
import pages.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class AlertsFramesWindowsPage extends HomePage {
    private final By modalDialogsMenuItem = By.xpath("//li[@id='item-4']/span[text()='Modal Dialogs']");

    public ModalDialogsPage clockModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);

        return new ModalDialogsPage();
    }
}