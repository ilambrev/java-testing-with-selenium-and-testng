package pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class FramesPage extends AlertsFramesWindowsPage {
    private final By textInFrame = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";

    private void switchToBigBox() {
        driver.switchTo().frame(iFrameBigBox);
    }

    public String getTextInBigFrame() {
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();

        System.out.println("Big Frame Text: " + bigFrameText);
        return bigFrameText;
    }

}