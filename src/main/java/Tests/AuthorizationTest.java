package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorizationTest extends tests.WebHooks {

    @Test
    public void testLogin() {
        // Открываем сайт
        open("https://edujira.ifellow.ru");

        // Создаем объект страницы
        LoginPage loginPage = new LoginPage();

        // Выполняем шаги
        loginPage.enterLogin("AT12");
        loginPage.enterPassword("Qwerty123");
        loginPage.clickLoginButton();

        // Проверяем, что произошёл переход на страницу Dashboard
        String currentUrl = url();
        String expectedUrl = "https://edujira.ifellow.ru/secure/Dashboard.jspa";
        assertEquals(expectedUrl, currentUrl, "Авторизация не удалась!");
    }
}
