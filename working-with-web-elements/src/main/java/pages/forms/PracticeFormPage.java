package pages.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormsPage {
    private final By femaleRadioButton = By.id("gender-radio-2");
    private final By sportsHobbyCheckbox = By.id("hobbies-checkbox-1");
    private final By readingHobbyCheckbox = By.id("hobbies-checkbox-2");
    private final By musicHobbyCheckbox = By.id("hobbies-checkbox-3");
    private final By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleRadioButtonSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsHobbyCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            clickJS(sportsHobbyCheckbox);
        }
    }

    public void clickReadingHobbyCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public void clickMusicHobbyCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            clickJS(musicHobbyCheckbox);
        }
    }

    public void unClickReadingHobbyCheckbox() {
        if (find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingHobbyCheckboxSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
        // Commented for CaptureFailedScreenshotTest to fail and to take screenshot
    //  scrollToElementJS(submitButton);
        click(submitButton);
    }
}