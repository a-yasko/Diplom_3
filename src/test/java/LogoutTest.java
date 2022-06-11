import com.codeborne.selenide.Selenide;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;
import pages.RegisterPage;

import static com.codeborne.selenide.Selenide.open;
import static data.TestData.getBaseUrl;

public class LogoutTest {
  @Test
  @DisplayName("Logout")
  public void logout() {
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
    profilePage.getLogoutButton().click();

    LoginPage loginPage1 = Selenide.page(new LoginPage());
    loginPage1.waitForLoadLoginPage();
  }
}