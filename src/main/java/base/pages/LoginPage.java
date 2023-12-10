package base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@type='text']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@class='button__white app__login--btn']")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='required']")
    private WebElement requiredBorder;


    public LoginPage enterWrongEmail(String email) {
        fillInputField(emailField, email);
        continueButton.click();
        return pageManager.getLoginPage();
    }

    public OtpPage enterCorrectEmail(String email) {
        fillInputField(emailField, email);
        continueButton.click();
        return pageManager.otpPage();
    }

    public LoginPage checkRequiredBorder() {
        borderRedColor(requiredBorder);
        return pageManager.getLoginPage();
    }

    public LoginPage checkLoginUrl(String url) {
        checkUrl(url);
        return pageManager.getLoginPage();
    }
}


