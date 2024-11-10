package tests.interactions;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult() {
        int x = 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(x, y);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "78";

        Assert.assertEquals(actualValue, expectedValue,
                "\n Actual & Expected Values Do Not Match \n");
    }
}