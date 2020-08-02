package page.signinPage;

import org.openqa.selenium.By;

public class SigninPageLocators {
    protected static final By START_BUTTON = By.xpath("/html/body/div[1]/div[6]/div/div[2]/a/span/span");
    protected static final By USERNAME_INPUT = By.xpath("//*[@id=\"passp-field-login\"]");
    protected static final By PASSWORD_INPUT = By.xpath("//*[@id=\"passp-field-passwd\"]");
    protected static final By SIGNIN_IN_BUTTON = By.cssSelector("#root > div > div > div.passp-flex-wrapper > div > div > div.passp-auth-content > div.passp-route-forward > div > div > div.passp-login-form > form > div.passp-button.passp-sign-in-button > button");
    protected static final By ICON = By.xpath("/html/body/div[1]/div[6]/div/div[2]/span/div");

}
