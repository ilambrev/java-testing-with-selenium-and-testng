package pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFramesWindowsPage {
    private final By textInFrame = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToBigBox() {
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox() {
        switchToFrameIndex(1);
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();

        System.out.println("Big Frame Text: " + bigFrameText);
        switchToDefaultContent();
        return bigFrameText;
    }

    public String getTextInSmallFrame() {
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();

        System.out.println("Small Frame Text: " + smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}