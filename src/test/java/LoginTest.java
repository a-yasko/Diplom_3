import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;
import static steps.Steps.register;

public class LoginTest {
  @After
  public void setUp() {
    Selenide.clearBrowserLocalStorage();
  }

  @Test
  @DisplayName("Login by button 'Login to account' on main page")
  public void loginByButtonLoginToAccount() {
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
  @DisplayName("Login by button 'Personal account'")
  public void loginByButtonPersonalAccount() {
    String email = register();

    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.getPersonalAccountButton().click();

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
  @DisplayName("Login by button 'Login' on register page")
  public void loginByButtonLoginOnRegisterPage() {
    String email = register();

    MainPage mainPage = open("https://stellarburgers.nomoreparties.site/", MainPage.class);
    mainPage.getPersonalAccountButton().click();

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
  @DisplayName("Login by button 'Login' on forgot-password page")
  public void loginByButtonLoginOnForgotPasswordPage() {
    String email = register();

    ForgotPasswordPage forgotPasswordPage = open("https://stellarburgers.nomoreparties.site/forgot-password", ForgotPasswordPage.class);
    forgotPasswordPage.waitForLoadForgotPasswordPage();
    forgotPasswordPage.getLoginButton().click();

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
}
