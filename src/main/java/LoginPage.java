import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//button[@data-type='login']")
	private WebElement mailButton;
	@FindBy(xpath="//input[@placeholder='Логин или email']")
	private WebElement userField;
	@FindBy(xpath="//input[@placeholder='Введите пароль']")
	private WebElement passwordField;


	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void goLogin(String user, String password) {
		mailButton.click();
		userField.sendKeys(user, Keys.ENTER);
		passwordField.sendKeys(password, Keys.ENTER);
	}
}
