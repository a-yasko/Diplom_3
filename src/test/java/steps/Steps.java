package steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class Steps {
  @Step("Check tab")
  public static void checkConstructorTab(SelenideElement selenideElement, String scrollExpectedValue) throws InterruptedException {
    selenideElement.click();
    Thread.sleep(1000);
    String scrollActual = executeJavaScript("return document.querySelector('.BurgerIngredients_ingredients__menuContainer__Xu3Mo').scrollTop.toString()");
    Assert.assertEquals(scrollExpectedValue, scrollActual);
  }
}
