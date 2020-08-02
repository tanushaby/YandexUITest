package page;

import driver.DriverSingleton;
import jdk.internal.instrumentation.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class BasePage {
    private WebDriver driver = DriverSingleton.getDriver();
    private Logger log;
    private ArrayList<String> tabs;
    private boolean goToHandle;

    protected WebElement lookForElement(By by) {
        return driver.findElement(by);
    }

    public void open(String pageURL) {
        driver.get(pageURL);
    }

    public void goToHandle() {
        for (String goToHandle : driver.getWindowHandles()) {
            driver.switchTo().window(goToHandle);
        }
    }


    public void switchToTheTab(int tab) {
        if (tabs == null) {
            tabs = new ArrayList<>(driver.getWindowHandles());
        }
        driver.switchTo().window(tabs.get(tab));
        log.info("Checked out to browser tab #" + tab);
    }
}
