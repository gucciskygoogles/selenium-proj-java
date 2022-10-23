package pages.results;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import org.testng.Assert;
import java.util.List;

public class ResultsPage extends BasePage {

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    By categoryIcon =
            By.xpath("//button[@class='c1l3w0tx dir dir-ltr']");

    By whereWord =
            By.xpath("//div[@class='lkm6i7z l1rzxhu2 lr5v90m dir dir-ltr']//button[1]//div[1]");

    public ResultsPage getCountOfIcons() {
        waitElementIsVisible(driver.findElement(categoryIcon));

        List<WebElement> icons = driver.findElements(categoryIcon);
        Assert.assertEquals(icons.size(), 54);
        return this;
    }

    public ResultsPage checkWord() {
        waitElementIsVisible(driver.findElement(whereWord));
        Assert.assertEquals(driver.findElement(whereWord).getText(), "Норвегия");
        System.out.println(driver.findElement(whereWord).getText());
        return this;
    }

}
