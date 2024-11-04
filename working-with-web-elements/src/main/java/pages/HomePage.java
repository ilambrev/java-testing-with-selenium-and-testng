package pages;

import org.openqa.selenium.By;
import pages.elements.ElementsPage;
import pages.forms.FormsPage;
import pages.widgest.WidgetsPage;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private final By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);

        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click((elementsCard));

        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);

        return new WidgetsPage();
    }
}