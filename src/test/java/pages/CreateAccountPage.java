package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="id_gender2")
    private WebElement womanRadioButton;

    @FindBy(id="id_gender1")
    private WebElement manRadioButton;

    @FindBy(id="customer_firstname")
    private WebElement firstNameInput;

    @FindBy(id="customer_lastname")
    private WebElement lastNameInput;

    @FindBy(id="passwd")
    private WebElement passwordInput;

    @FindBy(id="submitAccount")
    private WebElement registerButton;

    //TODO: pomyśleć nad wypełnianiem formularza datą urodzin

    public void createNewUser(String firstName, String lastName, String password) {
        //TODO: pomyśleć nad tym jak rozwiązać wybór płci w formularzu
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
        passwordInput.clear();
        passwordInput.sendKeys(password);

        registerButton.click();
    }
}
