package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage extends BasePage {
    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="email_create")
    private WebElement emailInput;

    @FindBy(id="SubmitCreate")
    private WebElement createAccountButton;

    public void createAccount(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
        createAccountButton.click();
    }

}
