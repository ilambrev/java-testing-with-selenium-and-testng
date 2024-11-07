package pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.switchToDefaultContent;
import static utilities.SwitchToUtility.switchToFrameString;

public class FramesPage extends AlertsFramesWindowsPage {
    private final By textInFrame = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    private void switchToBigBox() {
    //  driver.switchTo().frame(iFrameBigBox); // Without using SwitchToUtility Class methods
        switchToFrameString(iFrameBigBox);
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();

        System.out.println("Big Frame Text: " + bigFrameText);
    //  driver.switchTo().parentFrame();
    //  driver.switchTo().defaultContent(); // Without using SwitchToUtility Class methods
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }
}