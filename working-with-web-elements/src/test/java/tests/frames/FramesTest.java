package tests.frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";

        Assert.assertEquals(actualBigBoxText, expectedBigBoxText,
                "\n Actual & Expected Text Do Not Match \n");
    }
}