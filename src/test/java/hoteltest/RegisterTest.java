package hoteltest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AuthenticationPage;
import pages.CreateAccountPage;
import pages.HomePage;


import java.util.concurrent.TimeUnit;

public class RegisterTest {
    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    public void registerNewUserTest() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        HomePage homePage = new HomePage(driver);
        homePage.signIn();

        AuthenticationPage authPage = new AuthenticationPage(driver);
        // TODO: generuj maile losowo (np. z timestampem)
        authPage.createAccount("tralalala@email.com");

        CreateAccountPage createPage = new CreateAccountPage(driver);
        createPage.createNewUser("Janina", "Kowalska", "Password!");

        //TODO: sprawdź czy konto zostało utworzone (czy pojawił się zielony prostokąt z napisem)
    }


    @After
    public void tearDown() {
        // driver.quit();
    }



}
