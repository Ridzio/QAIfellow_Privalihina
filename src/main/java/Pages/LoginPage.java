package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    // Локаторы
    private final SelenideElement usernameField = $x("//div[@class='field-group']//input[@name='os_username']");
    private final SelenideElement passwordField = $x("//div[@class='field-group']//input[@name='os_password']");
    private final SelenideElement loginButton = $x("//button[@id='login']");

    // Методы взаимодействия
    public void enterLogin(String login) {
        usernameField.setValue(login);
    }

    public void enterPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
