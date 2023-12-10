package base.pages;

import managers.DriverManager;
import managers.PageManager;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected DriverManager driverManager = DriverManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();

    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);

    }

    //Заполнение полей определенным значением
    protected void fillInputField(WebElement element, String value) {
        element.click();
        element.sendKeys(value);
    }

    //Проверка изменения цвета рамки поля при ошибке
    protected void borderRedColor(WebElement element) {
        String expected = "rgba(255, 16, 16, 1)";
        Assert.assertEquals("Рамка другого цвета", element.getCssValue("color"), expected);
    }

    //Проверка текущего url
    public void checkUrl(String url) {
        Assert.assertEquals(url, driverManager.getDriver().getCurrentUrl());
    }
}
