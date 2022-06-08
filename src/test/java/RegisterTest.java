import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.RegisterPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static java.time.Duration.ofSeconds;

public class RegisterTest {
  @Test
  @DisplayName("Success register")
  public void successRegister() {
    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.waitForLoadMainPage();
    mainPage.getPersonalAccountButton().click();

    LoginPage loginPage = Selenide.page(new LoginPage());
    loginPage.waitForLoadLoginPage();
    loginPage.getRegisterButton().click();

    RegisterPage registerPage = Selenide.page(new RegisterPage());
    registerPage.waitForLoadRegisterPage();
    registerPage.getNameInput().setValue("Alexander");
    registerPage.getEmailInput().setValue(RandomStringUtils.randomAlphabetic(10) + "test-qa123@ya.ru");
    registerPage.getPasswordInput().setValue("123456");
    registerPage.getRegisterButton().click();

    webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/login"));
  }

  @Test
  @DisplayName("Register with invalid password")
  public void registerWithInvalidPassword() {
    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.waitForLoadMainPage();
    mainPage.getPersonalAccountButton().click();

    LoginPage loginPage = Selenide.page(new LoginPage());
    loginPage.waitForLoadLoginPage();
    loginPage.getRegisterButton().click();

    RegisterPage registerPage = Selenide.page(new RegisterPage());
    registerPage.waitForLoadRegisterPage();
    registerPage.getNameInput().setValue("Alexander");
    registerPage.getEmailInput().setValue(RandomStringUtils.randomAlphabetic(10) + "test-qa123@ya.ru");
    registerPage.getPasswordInput().setValue("123");
    registerPage.getRegisterButton().click();

    registerPage.getPasswordError().shouldBe(visible, ofSeconds(10));
  }
}
