package tests.searchapartments;

import org.testng.annotations.Test;
import tests.basetest.BaseTest;

import java.util.concurrent.TimeUnit;

public class SearchApartTest extends BaseTest {

    @Test
    public void checkCountOfGuestsButtonClick() throws InterruptedException {

        basePage
                .open("https://www.airbnb.ru/");

        TimeUnit
                .SECONDS
                .sleep(15);

        airbnbHome
                .clickOnCountOfGuests();

    }

    @Test
    public void checkIsRedirectToListing() throws InterruptedException {

        basePage
                .open("https://www.airbnb.ru/");

        TimeUnit
                .SECONDS
                .sleep(15);

        airbnbHome
                .clickOnCountOfGuests()
                .increaseCountOfAdults()
                .findResult();

        resultsPage
                .getCountOfIcons();

    }

    @Test
    public void findByKeyWord() throws InterruptedException {

        basePage
                .open("https://www.airbnb.ru/");

        TimeUnit
                .SECONDS
                .sleep(15);

        airbnbHome
                .inputInfoEndFind();

        TimeUnit
                .SECONDS
                .sleep(7);

        resultsPage
                .checkWord();
    }

}
