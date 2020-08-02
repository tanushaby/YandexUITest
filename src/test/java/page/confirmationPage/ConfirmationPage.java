package page.confirmationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.BasePage;

import static page.confirmationPage.ConfirmationPageLocators.CONFIRMATION_WINDOW;

public class ConfirmationPage extends BasePage {

    public boolean isDisplayed() {
        boolean displayed = lookForElement(CONFIRMATION_WINDOW).isDisplayed();
        return displayed;

    }
}
