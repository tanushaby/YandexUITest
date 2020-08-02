package page.errorMessagePage;

import org.openqa.selenium.By;

public class ErrorMessagePageLocator {
    protected static final By ERROR_EMPTY_LOGIN = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/" +
            "div[2]/div/div/div[1]/form/div[1]/div[2]");
    protected static final By ERROR_LOGIN_MESSAGE = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/" +
            "div[2]/div/div/div[1]/form/div[1]/div[2]");
    protected static final By ERROR_PASSWORD_MESSAGE = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/" +
            "div[3]/div[2]/div/div/form/div[2]/div/div[2]");

}
