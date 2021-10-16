package hoteltest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class SearchTest {
    private WebDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://hotel-testlab.coderslab.pl/en/");
    }

    @Test
    public void searchHotel() {
        HomePage homePage = new HomePage(driver);
        homePage.searchHotel("Warsaw", "21-10-2021", "25-10-2021");
    }

}
