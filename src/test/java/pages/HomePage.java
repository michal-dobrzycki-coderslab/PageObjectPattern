package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="span.hide_xs")
    private WebElement signInButton;

    @FindBy(id="hotel_location")
    private WebElement locationInput;

    @FindBy(id="hotel_cat_name")
    private WebElement hotelDropdown;

    @FindBy(xpath = "//li[@data-id-hotel='1']")
    private WebElement firstHotel;

    @FindBy(id="check_in_time")
    WebElement checkInTimeInput;

    @FindBy(id="check_out_time")
    WebElement checkOutTimeInput;

    @FindBy(id="search_room_submit")
    WebElement searchNowButton;


    public void signIn() {
        signInButton.click();
    }

    public void searchHotel(String hotelName, String checkinDate, String checkoutDate) {
        locationInput.sendKeys(hotelName);
        hotelDropdown.click();
        firstHotel.click();
        checkInTimeInput.sendKeys(checkinDate);
        checkOutTimeInput.sendKeys(checkoutDate);
        searchNowButton.click();
    }
}
