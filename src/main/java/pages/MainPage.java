package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static java.time.Duration.ofSeconds;

public class MainPage {
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

  // Заголовок "Соберите бургер"
  @FindBy(how = How.XPATH, using = ".//h1[text()='Соберите бургер']")
  private SelenideElement collectBurgerHeader;

  // Раздел "Булки"
  @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
  private SelenideElement bunsTab;

  // Раздел "Соусы"
  @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
  private SelenideElement saucesTab;

  // Раздел "Начинки"
  @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
  private SelenideElement fillingsTab;

  // Кнопка "Войти в аккаунт"
  @FindBy(how = How.CLASS_NAME, using = "button_button_size_large__G21Vg")
  private SelenideElement loginButton;

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

  public SelenideElement getCollectBurgerHeader() {
    return collectBurgerHeader;
  }

  public SelenideElement getBunsTab() {
    return bunsTab;
  }

  public SelenideElement getSaucesTab() {
    return saucesTab;
  }

  public SelenideElement getFillingsTab() {
    return fillingsTab;
  }

  public SelenideElement getLoginButton() {
    return loginButton;
  }

  public void waitForLoadMainPage() {
    getLogo().shouldBe(visible, ofSeconds(10));
    getCollectBurgerHeader().shouldBe(visible, ofSeconds(10));
    getLoginButton().shouldBe(visible, ofSeconds(10));
  }
}
