package ru.lanit.framework.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lanit.framework.webdriver.WebDriverManager;

import java.util.List;
public class дз5 {

    @Test
    public void testLanit() throws InterruptedException {
        WebDriver webDriver = WebDriverManager.getDriver();
        webDriver.get("https://dev.n7lanit.ru/");
        Thread.sleep(1000);
        webDriver.findElement(By.linkText("Категории")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.linkText("Пользователи")).click();
        Thread.sleep(1000);
        WebElement webElement = webDriver.findElement(By.linkText("search"));
        List<WebElement> webElements = webDriver.findElements(By.xpath("//div"));
        webElement.click();
        Thread.sleep(1000);
        webElement = webDriver.findElement(By.className("form-control"));
        webElement.sendKeys("Dasha");
        Thread.sleep(1000);
        System.out.println("Открыт браузер " + ((ChromeDriver) webDriver).getSessionId());
        webDriver.quit();

    }
}

