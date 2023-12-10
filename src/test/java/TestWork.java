import base.BaseTests;
import org.junit.Test;

import static data.LoginForm.CORRECT_EMAIL;
import static data.LoginForm.WRONG_EMAIL;
import static data.OtpForm.*;

public class TestWork extends BaseTests {


    @Test
    public void wrongEmail() {
        pageManager.getLoginPage()
                .enterWrongEmail(WRONG_EMAIL.getEmail())
                .checkRequiredBorder()
                .checkLoginUrl("https://t-games.dev3.net-page.ru/");
    }

    @Test
    public void wrongOtp() {
        pageManager.getLoginPage().enterCorrectEmail(CORRECT_EMAIL.getEmail())
                .fillOtpField(OTP1.getOtp(), OTP2.getOtp(), OTP3.getOtp(), OTP4.getOtp(), OTP5.getOtp(), OTP6.getOtp())
                .checkErrorWindow()
                .checkClearOtp();
    }
}