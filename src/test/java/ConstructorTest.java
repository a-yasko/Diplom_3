import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;
import static com.codeborne.selenide.Selenide.*;
import static steps.Steps.checkTab;

public class ConstructorTest {
  @Test
  @DisplayName("Check tabs")
  public void checkTabs() throws InterruptedException {
    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.waitForLoadMainPage();

    checkTab(mainPage.getSaucesTab(), "371", "Соусы");
    checkTab(mainPage.getFillingsTab(), "960", "Начинки");
    checkTab(mainPage.getBunsTab(), "40", "Булки");
  }
}
