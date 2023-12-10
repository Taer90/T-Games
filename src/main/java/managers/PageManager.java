package managers;

import base.pages.LoginPage;
import base.pages.OtpPage;

public class PageManager {
    private static PageManager INSTANCE = null;

    private LoginPage loginPage;
    private OtpPage otpPage;


    private PageManager() {
    }

    public static PageManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public OtpPage otpPage() {
        if (otpPage == null) {
            otpPage = new OtpPage();
        }
        return otpPage;
    }

}
