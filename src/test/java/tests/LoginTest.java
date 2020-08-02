package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.confirmationPage.ConfirmationPage;
import page.errorMessagePage.ErrorMessagePage;
import page.signinPage.SigninPage;


public class LoginTest extends BaseTest {
    SigninPage signinPage;
    ConfirmationPage confirmationPage;
    ErrorMessagePage errorMessagePage;
    String login = "tatyana.kartavenkova";
    String pas = "egor09112006";


    @BeforeMethod
    public void setUp() {
        signinPage = new SigninPage();
        confirmationPage = new ConfirmationPage();
        errorMessagePage = new ErrorMessagePage();
        signinPage.open();
        signinPage.clickLoginButtonOnHomePage();

    }

    @Test(description = "Все поля валидные")
    public void validLoginTest() {
        signinPage.insertLogin(login);
        signinPage.clickLoginButton();
        signinPage.insertPassword(pas);
        signinPage.clickLoginButton();
        signinPage.switchToTheTab(0);
        signinPage.clickOnIcon();

        Assert.assertTrue(confirmationPage.isDisplayed());
    }

   @Test(description = "Поле логин пустое")
    public void LoginFieldIsEmpty() {
        signinPage.clickLoginButton();

        Assert.assertTrue(errorMessagePage.errorMessageEmptyLogin());
    }

    @Test(description = "Поле пороль невалидное")
    public void oneEmptyFields() {
        signinPage.insertLogin(login);
        signinPage.clickLoginButton();
        signinPage.insertPassword(" ");
        signinPage.clickLoginButton();


        Assert.assertTrue(errorMessagePage.errorMessagePassword());
    }

    @Override
    @AfterTest
    public void tearDown() {
        super.tearDown();
        signinPage = null;
        confirmationPage = null;
        errorMessagePage = null;
    }
}
