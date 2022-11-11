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
    public void goLogIn(){
        logIn.click();
}

}
