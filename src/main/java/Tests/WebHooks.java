package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebHooks {

    @BeforeAll
    public static void setUp() {
        // Настройка Selenide
        Configuration.browser = "chrome";

        // Настройка параметров Chrome для открытия окна на весь экран
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        // Применение настроек
        WebDriverRunner.setWebDriver(new org.openqa.selenium.chrome.ChromeDriver(options));

        // Таймаут ожидания элементов
        Configuration.timeout = 10000;
    }
}

