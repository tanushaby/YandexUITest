package page.errorMessagePage;

import page.BasePage;

import static page.errorMessagePage.ErrorMessagePageLocator.*;

public class ErrorMessagePage extends BasePage {
    public boolean errorMessageLogin() {
        return lookForElement(ERROR_LOGIN_MESSAGE).isDisplayed();
    }

    public boolean errorMessagePassword() {
        return lookForElement(ERROR_PASSWORD_MESSAGE).isDisplayed();
    }

    public boolean errorMessageEmptyLogin() {
        return lookForElement(ERROR_EMPTY_LOGIN).isDisplayed();
    }

}