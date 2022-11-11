import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiskPage extends BasePage {

    @FindBy(xpath="//a[@aria-label='Меню профиля, вход выполнен']")
    private WebElement clickMenuProfile;
    @FindBy(xpath="//span[text()='Диск']")
    private WebElement disk;
	@FindBy(xpath="//div[@class='listing-item__icon listing-item__icon_type_icon listing-item__icon_resource_file']")
	private WebElement testFile;
	@FindBy(xpath="//div[@value='copy']")
	private WebElement clickCopy;
	@FindBy(xpath="//div[@title='dir']")
	private WebElement clickDir;
	@FindBy(xpath="//button[@class='Button2 Button2_view_action Button2_size_m confirmation-dialog__button confirmation-dialog__button_submit ']")
	private WebElement clickCopyButton;
	@FindBy(xpath="//div[@class='listing-item listing-item_theme_tile listing-item_size_m listing-item_type_dir js-prevent-deselect']")
	private WebElement folder;
	@FindBy(xpath="//div[@class='listing-item listing-item_theme_tile listing-item_size_m listing-item_type_file js-prevent-deselect']")
	private WebElement fileDelete;
	@FindBy(xpath="//div[@value='delete']")
	private WebElement delete;
	@FindBy(xpath="//a[@aria-label='Аккаунт']")
	private WebElement clickAc;
	@FindBy(xpath="//a[@aria-label='Выйти из аккаунта']")
	private WebElement exit;


    public DiskPage() {

        PageFactory.initElements(driver, this);
    }

    public void goDisk(){
        clickMenuProfile.click();
        disk.click();

        for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab); // переключаемся на 2 вкладку в браузере
        }
        act.contextClick(testFile).build().perform();
        clickCopy.click();
        clickDir.click();
        clickCopyButton.click();
        act.doubleClick(folder).build().perform();
        act.contextClick(fileDelete).build().perform();
        delete.click();
        clickAc.click();
        exit.click();

        driver.switchTo().alert().accept();
    }

}
