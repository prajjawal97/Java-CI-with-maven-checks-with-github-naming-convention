package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;
    public static ThreadLocal<WebDriver> testdriver = new ThreadLocal<WebDriver>();

    public WebDriver initialize_driver() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1200");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--no-sandbox","--disable-dev-shm-usage","--disable-extensions");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        tdriver.set(driver);
        return getDriver();
    }

    public static synchronized WebDriver getDriver() {
        return testdriver.get();
    }
}
