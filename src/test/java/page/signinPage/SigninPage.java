package page.signinPage;

import page.BasePage;

import static page.signinPage.SigninPageLocators.*;

public class SigninPage extends BasePage {
    String pageURL = "https://music.yandex.ru/home";

    public void clickLoginButtonOnHomePage() {
        lookForElement(START_BUTTON).click();
        goToHandle();
    }

    public void insertLogin(String login) {
        lookForElement(USERNAME_INPUT).sendKeys(login);
    }

    public void insertPassword(String password) {
        lookForElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLoginButton() {
        lookForElement(SIGNIN_IN_BUTTON).click();
    }

    public void clickOnIcon() {
        goToHandle();
        lookForElement(ICON).click();
    }

    public void open() {
        super.open(pageURL);

    }


}
