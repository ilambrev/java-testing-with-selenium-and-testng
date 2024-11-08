package pages.alerts_frames_windows;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.*;

public class FramesPage extends AlertsFramesWindowsPage {
    private final By textInFrame = By.id("sampleHeading");
    private final String iFrameBigBox = "frame1";
    private final By headerFramesText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private final By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    public String getHeaderFramesText() {
        return find(headerFramesText).getText();
    }

    private void switchToBigBox() {
        // Switch To Frame Using String
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox() {
        // Switch To Frame Using Index
        // switchToFrameIndex(1);
        // Switch To Frame Using WebElement
        switchToFrameElement(find(iFrameSmallBox));
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