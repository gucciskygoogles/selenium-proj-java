package pages.airbnbhome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class AirbnbHome extends BasePage {

    public AirbnbHome(WebDriver driver) {
        super(driver);
    }

    By countOfGuests =
            By.xpath("//div[@class='f1xx50dm f1rzp9sv dir dir-ltr']");
    By plusCountOfAdults =
            By.xpath("//button[@aria-describedby='searchFlow-title-label-stepper-adults'][2]");

    By findResultsButton =
            By.xpath("//span[@class='_kaq6tx']");

    By onlineImpressions =
            By.xpath("//div[@class='tho47y5 dir dir-ltr']");

    By searchEverywhere =
            By.xpath("//div[@class='lkm6i7z l1rzxhu2 lr5v90m dir dir-ltr']//button[1]//div[1]");

    By whereQuestion =
            By.xpath("//input[@id='bigsearch-query-location-input']");


    public AirbnbHome clickOnCountOfGuests() {
        waitElementIsVisible(driver.findElement(countOfGuests));
        driver.findElement(countOfGuests).click();
        waitElementIsVisible(driver.findElement(onlineImpressions));
        Assert.assertTrue(driver.findElement(onlineImpressions).isDisplayed());
        return this;
    }

    public AirbnbHome increaseCountOfAdults() {
        waitElementIsVisible(driver.findElement(plusCountOfAdults));
        driver.findElement(plusCountOfAdults).click();
        return this;
    }

    public AirbnbHome findResult() {
        waitElementIsVisible(driver.findElement(findResultsButton));
        driver.findElement(findResultsButton).click();
        return this;
    }


    public AirbnbHome inputInfoEndFind() {
        waitElementIsVisible(driver.findElement(searchEverywhere));
        driver.findElement(searchEverywhere).click();
        waitElementIsVisible(driver.findElement(whereQuestion));
        WebElement where = driver.findElement(whereQuestion);
        where.click();
        where.sendKeys("норвегия");
        driver.findElement(findResultsButton).click();
        return this;
    }


}
