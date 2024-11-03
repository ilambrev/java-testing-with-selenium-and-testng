package pages.elements;

import org.openqa.selenium.By;
import pages.HomePage;

public class ElementsPage extends HomePage {
    private final By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private final By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablesPage clickWebTables() {
        click(webTablesMenuItem);

        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);

        return new LinksPage();
    }
}