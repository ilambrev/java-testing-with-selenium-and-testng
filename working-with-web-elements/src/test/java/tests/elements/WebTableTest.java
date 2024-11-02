package tests.elements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {
        String email = "alden@example.com";
        String expectedAge = "34";

        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("34");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);

        Assert.assertEquals(actualAge, expectedAge, "Actual & Expected Ages Do Not Match");
    }
}