package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class LoginPage {
  // Кнопка "Конструктор"
  @FindBy(how = How.XPATH, using = ".//p[text()='Конструктор']")
  private SelenideElement constructorButton;

  // Кнопка "Лента заказов"
  @FindBy(how = How.XPATH, using = ".//p[text()='Лента заказов']")
  private SelenideElement orderLineButton;

  // Кнопка "Личный Кабинет"
  @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
  private SelenideElement personalAccountButton;

  // Логотип
  @FindBy(how = How.CLASS_NAME, using = "AppHeader_header__logo__2D0X2")
  private SelenideElement logo;
  // Заголовок "Вход"
  @FindBy(how = How.XPATH, using = ".//h2[text()='Вход']")
  private SelenideElement loginHeader;

  // Поле "Email"
  @FindBy(how = How.XPATH, using = ".//input[@type='text']")
  private SelenideElement emailInput;

  // Поле "Пароль"
  @FindBy(how = How.XPATH, using = ".//input[@type='password']")
  private SelenideElement passwordInput;

  // Кнопка "Войти"
  @FindBy(how = How.CLASS_NAME, using = "button_button_size_medium__3zxIa")
  private SelenideElement loginButton;

  // Кнопка "Зарегистрироваться"
  @FindBy(how = How.XPATH, using = ".//a[text()='Зарегистрироваться']")
  private SelenideElement registerButton;

  // Кнопка "Восстановить пароль"
  @FindBy(how = How.XPATH, using = ".//a[text()='Восстановить пароль']")
  private SelenideElement restorePasswordButton;

  public SelenideElement getLoginHeader() {
    return loginHeader;
  }

  public SelenideElement getEmailInput() {
    return emailInput;
  }

  public SelenideElement getPasswordInput() {
    return passwordInput;
  }

  public SelenideElement getLoginButton() {
    return loginButton;
  }

  public SelenideElement getRegisterButton() {
    return registerButton;
  }

  public SelenideElement getRestorePasswordButton() {
    return restorePasswordButton;
  }

  public SelenideElement getConstructorButton() {
    return constructorButton;
  }

  public SelenideElement getOrderLineButton() {
    return orderLineButton;
  }

  public SelenideElement getPersonalAccountButton() {
    return personalAccountButton;
  }

  public SelenideElement getLogo() {
    return logo;
  }

  public void waitForLoadLoginPage() {
    getLoginHeader().shouldBe(visible, ofSeconds(10));
    getEmailInput().shouldBe(visible, ofSeconds(10));
    getRestorePasswordButton().shouldBe(visible, ofSeconds(10));
  }
}
