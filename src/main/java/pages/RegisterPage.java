package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static java.time.Duration.ofSeconds;

public class RegisterPage {
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

  // Заголовок "Регистрация"
  @FindBy(how = How.XPATH, using = ".//h2[text()='Регистрация']")
  private SelenideElement registerHeader;

  // Текстовые поля для ввода
  private ElementsCollection textInputs = $$(By.xpath(".//input[@type='text']"));

  // Поле имя
  private SelenideElement nameInput = textInputs.get(0);

  // Поле Email
  private SelenideElement emailInput = textInputs.get(1);

  // Поле "Пароль"
  @FindBy(how = How.XPATH, using = ".//input[@type='password']")
  private SelenideElement passwordInput;

  // Кнопка "Зарегистрироваться"
  @FindBy(how = How.CLASS_NAME, using = "button_button_size_medium__3zxIa")
  private SelenideElement registerButton;

  // Кнопка "Войти"
  @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
  private SelenideElement loginButton;

  // Ошибка "Некорректный пароль"
  @FindBy(how = How.XPATH, using = ".//p[text()='Некорректный пароль']")
  private SelenideElement passwordError;

  public SelenideElement getRegisterHeader() {
    return registerHeader;
  }

  public ElementsCollection getTextInputs() {
    return textInputs;
  }

  public SelenideElement getNameInput() {
    return nameInput;
  }

  public SelenideElement getEmailInput() {
    return emailInput;
  }

  public SelenideElement getPasswordInput() {
    return passwordInput;
  }

  public SelenideElement getRegisterButton() {
    return registerButton;
  }

  public SelenideElement getLoginButton() {
    return loginButton;
  }

  public SelenideElement getPasswordError() {
    return passwordError;
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

  public void waitForLoadRegisterPage() {
    getRegisterHeader().shouldBe(visible, ofSeconds(10));
    getEmailInput().shouldBe(visible, ofSeconds(10));
    getRegisterButton().shouldBe(visible, ofSeconds(10));
  }
}
