import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
	@FindBy(xpath="//a[text()='Войти']")
	private WebElement logIn;

    public MainPage() {
        driver.get("https://ya.ru");
        PageFactory.initElements(driver, this);
    }
    // метод для нажатия на кнопку "Войти" и перехода на страницу ввода логина
    public LoginPage goLogIn(){
        logIn.click();
        return new LoginPage(driver);
}

}
