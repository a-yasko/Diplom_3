import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;

import static com.codeborne.selenide.Selenide.open;
import static steps.Steps.register;

public class FollowingToLinksTest {
  @After
  public void setUp() {
    Selenide.clearBrowserLocalStorage();
  }

  @Test
  @DisplayName("Following to personal account")
  public void followingToPersonalAccount() {
    String email = register();

    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.waitForLoadMainPage();
    mainPage.getLoginButton().click();

    LoginPage loginPage = Selenide.page(new LoginPage());
    loginPage.waitForLoadLoginPage();
    loginPage.getEmailInput().setValue(email);
    loginPage.getPasswordInput().setValue("123456");
    loginPage.getLoginButton().click();

    MainPage mainPage1 = Selenide.page(new MainPage());
    mainPage1.waitForLoadMainPage();
    mainPage1.getPersonalAccountButton().click();

    ProfilePage profilePage = Selenide.page(new ProfilePage());
    profilePage.waitForLoadProfilePage();
  }

  @Test
  @DisplayName("Following from personal account to constructor by button 'Constructor'")
  public void followingToConstructorByMenu() {
    String email = register();

    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.waitForLoadMainPage();
    mainPage.getLoginButton().click();

    LoginPage loginPage = Selenide.page(new LoginPage());
    loginPage.waitForLoadLoginPage();
    loginPage.getEmailInput().setValue(email);
    loginPage.getPasswordInput().setValue("123456");
    loginPage.getLoginButton().click();

    MainPage mainPage1 = Selenide.page(new MainPage());
    mainPage1.waitForLoadMainPage();
    mainPage1.getPersonalAccountButton().click();

    ProfilePage profilePage = Selenide.page(new ProfilePage());
    profilePage.waitForLoadProfilePage();
    profilePage.getConstructorButton().click();

    MainPage mainPage2 = Selenide.page(new MainPage());
    mainPage2.waitForLoadMainPage();
  }

  @Test
  @DisplayName("Following from personal account to constructor by logo")
  public void followingToConstructorByLogo() {
    String email = register();

    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.waitForLoadMainPage();
    mainPage.getLoginButton().click();

    LoginPage loginPage = Selenide.page(new LoginPage());
    loginPage.waitForLoadLoginPage();
    loginPage.getEmailInput().setValue(email);
    loginPage.getPasswordInput().setValue("123456");
    loginPage.getLoginButton().click();

    MainPage mainPage1 = Selenide.page(new MainPage());
    mainPage1.waitForLoadMainPage();
    mainPage1.getPersonalAccountButton().click();

    ProfilePage profilePage = Selenide.page(new ProfilePage());
    profilePage.waitForLoadProfilePage();
    profilePage.getLogo().click();

    MainPage mainPage2 = Selenide.page(new MainPage());
    mainPage2.waitForLoadMainPage();
  }
}