package base;

import managers.DriverManager;
import managers.PageManager;
import org.junit.AfterClass;
import org.junit.Before;

public class BaseTests {
    private static DriverManager driverManager = DriverManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();

    @Before
    public void before() {
        String baseUrl = "https://t-games.dev3.net-page.ru/";
        driverManager.getDriver().get(baseUrl);
    }

    @AfterClass
    public static void after() {
        driverManager.getDriver().quit();
    }

}
