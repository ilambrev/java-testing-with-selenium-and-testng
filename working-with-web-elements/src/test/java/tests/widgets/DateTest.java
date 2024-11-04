package tests.widgets;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String day = "31";
        String month = "December";
        String monthNumber = "12";
        String year = "2034";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        Assert.assertEquals(actualDate, expectedDate,
                "\n Actual & Expected Dates Do Not Match" +
                "\n Actual Date:   " + actualDate +
                "\n Expected Date: " + expectedDate);
    }
}