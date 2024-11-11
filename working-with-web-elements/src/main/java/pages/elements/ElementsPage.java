package pages.elements;

import org.openqa.selenium.By;
import pages.HomePage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {
    private final By webTablesMenuItem = By.xpath("//li[@id='item-3']/span[text()='Web Tables']");
    private final By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private final By dynamicPropertiesMenuItem = By.xpath("//li[@id='item-8']/span[text()='Dynamic Properties']");
    private final By textBoxMenuItem = By.xpath("//li[@id='item-0']/span[text()='Text Box']");

    public WebTablesPage clickWebTables() {
        click(webTablesMenuItem);

        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);

        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties() {
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);

        return new DynamicPropertiesPage();
    }

    public TextBoxPage clickTextBox() {
        scrollToElementJS(textBoxMenuItem);
        click(textBoxMenuItem);

        return new TextBoxPage();
    }
}