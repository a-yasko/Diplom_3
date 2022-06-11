import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.MainPage;
import static com.codeborne.selenide.Selenide.*;
import static data.TestData.getBaseUrl;
import static steps.Steps.checkConstructorTab;

public class ConstructorTest {
  @Test
  @DisplayName("Check tabs")
  public void checkTabs() throws InterruptedException {
    MainPage mainPage = open(getBaseUrl(), MainPage.class);
    mainPage.waitForLoadMainPage();

    checkConstructorTab(mainPage.getSaucesTab(), "371");
    checkConstructorTab(mainPage.getFillingsTab(), "960");
    checkConstructorTab(mainPage.getBunsTab(), "40");
  }
}
