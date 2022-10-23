package common;

import org.openqa.selenium.Dimension;
import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.IMPLICITY_WAIT;
import static common.Config.PLATFORM_AND_BROWSER;

public class CommonAction {
    private static WebDriver driver = null;

    private CommonAction() {
    }

    public static WebDriver createDriver() {
        if (driver == null) {
            switch (PLATFORM_AND_BROWSER) {
                case "win_chrome":
                driver = new ChromeDriver();
                break;
                default:
                    Assert.fail();
            }
            driver.manage().window().setSize(new Dimension(1920, 1024));
            driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.SECONDS);

        }
        return driver;
    }
}
