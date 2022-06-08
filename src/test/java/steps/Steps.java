package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import pages.MainPage;
import pages.RegisterPage;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;

public class Steps {
  @Step("Register new user")
  public static String register() {
    String email = RandomStringUtils.randomAlphabetic(10) + "test-qa123@ya.ru";

    RegisterPage registerPage = open("https://stellarburgers.nomoreparties.site/register", RegisterPage.class);
    registerPage.waitForLoadRegisterPage();
    registerPage.getNameInput().setValue("Alexander");
    registerPage.getEmailInput().setValue(email);
    registerPage.getPasswordInput().setValue("123456");
    registerPage.getRegisterButton().click();

    return email;
  }

  @Step("Check tab {name}")
  public static void checkTab(SelenideElement selenideElement, String scrollExpectedValue, String name) throws InterruptedException {
    selenideElement.click();
    Thread.sleep(1000);
    String scrollActual = executeJavaScript("return document.querySelector('.BurgerIngredients_ingredients__menuContainer__Xu3Mo').scrollTop.toString()");
    Assert.assertEquals(scrollExpectedValue, scrollActual);
  }
}
