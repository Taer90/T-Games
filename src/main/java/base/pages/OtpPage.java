package base.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpPage extends BasePage {
    public OtpPage() {
        PageFactory.initElements(driverManager.getDriver(), this);
    }

    @FindBy(xpath = "//form[@class='app__login--form']/div/input[@class='app__login--verification'][1]")
    private WebElement otpField1;

    @FindBy(xpath = "//form[@class='app__login--form']/div/input[@class='app__login--verification'][2]")
    private WebElement otpField2;

    @FindBy(xpath = "//form[@class='app__login--form']/div/input[@class='app__login--verification'][3]")
    private WebElement otpField3;

    @FindBy(xpath = "//form[@class='app__login--form']/div/input[@class='app__login--verification'][4]")
    private WebElement otpField4;

    @FindBy(xpath = "//form[@class='app__login--form']/div/input[@class='app__login--verification'][5]")
    private WebElement otpField5;

    @FindBy(xpath = "//form[@class='app__login--form']/div/input[@class='app__login--verification'][6]")
    private WebElement otpField6;

    @FindBy(xpath = "//button[@class='button__white app__login--btn']")
    private WebElement otpContinueButton;

    @FindBy(xpath = "//div[@class='basic-modal']")
    private WebElement errorWindow;

    @FindBy(xpath = "//button[@class='basic-modal__close']")
    private WebElement closeWindowButton;


    public OtpPage fillOtpField(String value1, String value2, String value3, String value4, String value5, String value6) {
        fillInputField(otpField1, value1);
        fillInputField(otpField2, value2);
        fillInputField(otpField3, value3);
        fillInputField(otpField4, value4);
        fillInputField(otpField5, value5);
        fillInputField(otpField6, value6);
        otpContinueButton.click();
        return pageManager.otpPage();
    }

    public OtpPage checkErrorWindow() {
        errorWindow.isDisplayed();
        closeWindowButton.click();
        return pageManager.otpPage();
    }

    public OtpPage checkClearOtp() {
        Assert.assertEquals(otpField1.getText(), "");
        Assert.assertEquals(otpField2.getText(), "");
        Assert.assertEquals(otpField3.getText(), "");
        Assert.assertEquals(otpField4.getText(), "");
        Assert.assertEquals(otpField5.getText(), "");
        Assert.assertEquals(otpField6.getText(), "");
        return pageManager.otpPage();
    }

}
