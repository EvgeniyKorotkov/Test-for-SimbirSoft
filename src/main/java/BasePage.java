import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

abstract public class BasePage {
    protected static WebDriver driver;
    Actions act = new Actions(driver);

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }
}
