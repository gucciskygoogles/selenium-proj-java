package tests.basetest;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.airbnbhome.AirbnbHome;
import pages.base.BasePage;
import pages.results.ResultsPage;


public class BaseTest {

    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected AirbnbHome airbnbHome = new AirbnbHome(driver);
    protected ResultsPage resultsPage = new ResultsPage(driver);

    @AfterSuite(alwaysRun = true)
    public void quite() {
        driver.quit();
    }

   // WebDriverWait wait = new WebDriverWait(driver, 10);

  //  protected void switchWindow() {

        /*JavascriptExecutor js = (JavascriptExecutor) driver;

        String window = driver.getWindowHandle();

        js.executeScript("window.open()");

        Set<String> currentWindows = driver.getWindowHandles();

        String windowTwo = null;

        for (String wind: currentWindows) {
            windowTwo = window;
            break;
        }

        driver.switchTo().window(windowTwo);*/

        //Alert

        /*Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();*/


}
