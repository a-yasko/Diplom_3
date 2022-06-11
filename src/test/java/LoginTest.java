import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Test;
import pages.*;

import static com.codeborne.selenide.Selenide.open;
import static data.TestData.getBaseUrl;

public class LoginTest {
  @After
  public void setUp() {
    Selenide.clearBrowserLocalStorage();
  }

  @Test
  @DisplayName("Login by button 'Login to account' on main page")
  public void loginByButtonLoginToAccount() {
    RegisterPage registerPage = open(getBaseUrl() + "/register", RegisterPage.class);
    registerPage.waitForLoadRegisterPage();
    String email = registerPage.registerUser();

    MainPage mainPage = open(getBaseUrl(), MainPage.class);
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
    RegisterPage registerPage = open(getBaseUrl() + "/register", RegisterPage.class);
    registerPage.waitForLoadRegisterPage();
    String email = registerPage.registerUser();

    MainPage mainPage = open(getBaseUrl(), MainPage.class);
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
    RegisterPage registerPage = open(getBaseUrl() + "/register", RegisterPage.class);
    registerPage.waitForLoadRegisterPage();
    String email = registerPage.registerUser();

    MainPage mainPage = open(getBaseUrl(), MainPage.class);
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
    RegisterPage registerPage = open(getBaseUrl() + "/register", RegisterPage.class);
    registerPage.waitForLoadRegisterPage();
    String email = registerPage.registerUser();

    ForgotPasswordPage forgotPasswordPage = open(getBaseUrl() + "/forgot-password", ForgotPasswordPage.class);
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