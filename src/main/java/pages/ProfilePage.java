package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static java.time.Duration.ofSeconds;

public class ProfilePage {
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

  // Кнопка "Профиль"
  @FindBy(how = How.XPATH, using = ".//a[text()='Профиль']")
  private SelenideElement profileButton;

  // Кнопка "История заказов"
  @FindBy(how = How.XPATH, using = ".//a[text()='История заказов']")
  private SelenideElement orderHistoryButton;

  // Кнопка "Выход"
  @FindBy(how = How.XPATH, using = ".//button[text()='Выход']")
  private SelenideElement logoutButton;

  // Текст "В этом разделе вы можете изменить свои персональные данные"
  @FindBy(how = How.CLASS_NAME, using = "Account_text__fZAIn")
  private SelenideElement textUnderLogoutButton;

  // Текстовые поля
  private ElementsCollection textInputs = $$(By.xpath(".//input[@type='text']"));

  // Поле имя
  private SelenideElement nameInput = textInputs.get(0);

  // Поле Email
  private SelenideElement emailInput = textInputs.get(1);

  // Поле "Пароль"
  @FindBy(how = How.XPATH, using = ".//input[@type='password']")
  private SelenideElement passwordInput;

  // Кнопки редактирования полей
  private ElementsCollection inputIconAction = $$(By.className("input__icon-action"));

  // Кнопка "Отмена"
  @FindBy(how = How.XPATH, using = ".//button[text()='Отмена']")
  private SelenideElement cancelButton;

  // Кнопка "Сохранить"
  @FindBy(how = How.XPATH, using = ".//button[text()='Сохранить']")
  private SelenideElement saveButton;

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

  public SelenideElement getProfileButton() {
    return profileButton;
  }

  public SelenideElement getOrderHistoryButton() {
    return orderHistoryButton;
  }

  public SelenideElement getLogoutButton() {
    return logoutButton;
  }

  public SelenideElement getTextUnderLogoutButton() {
    return textUnderLogoutButton;
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

  public ElementsCollection getInputIconAction() {
    return inputIconAction;
  }

  public SelenideElement getCancelButton() {
    return cancelButton;
  }

  public SelenideElement getSaveButton() {
    return saveButton;
  }

  public void waitForLoadProfilePage() {
    getLogoutButton().shouldBe(visible, ofSeconds(10));
    getNameInput().shouldBe(visible, ofSeconds(10));
    getInputIconAction().get(0).shouldBe(visible, ofSeconds(10));
  }
}
