package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class ForgotPasswordPage {
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

  // Заголовок "Восстановление пароля"
  @FindBy(how = How.XPATH, using = ".//h2[text()='Восстановление пароля']")
  private SelenideElement forgotPasswordHeader;

  // Поле "Email"
  @FindBy(how = How.XPATH, using = ".//input[@type='text']")
  private SelenideElement emailInput;

  // Кнопка "Восстановить"
  @FindBy(how = How.CLASS_NAME, using = "button_button_size_medium__3zxIa")
  private SelenideElement restoreButton;

  // Кнопка "Войти"
  @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
  private SelenideElement loginButton;

  public SelenideElement getForgotPasswordHeader() {
    return forgotPasswordHeader;
  }

  public SelenideElement getEmailInput() {
    return emailInput;
  }

  public SelenideElement getRestoreButton() {
    return restoreButton;
  }

  public SelenideElement getLoginButton() {
    return loginButton;
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

  public void waitForLoadForgotPasswordPage() {
    getForgotPasswordHeader().shouldBe(visible, ofSeconds(10));
    getEmailInput().shouldBe(visible, ofSeconds(10));
    getRestoreButton().shouldBe(visible, ofSeconds(10));
  }
}
