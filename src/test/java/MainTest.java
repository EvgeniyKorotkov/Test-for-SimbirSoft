import org.junit.Assert;
import org.junit.Test;

public class MainTest extends BeforeAfter {

  @Test
    public void getStart() {
    MainPage mainPage = new MainPage();
    mainPage.goLogIn();
    LoginPage loginPage = new LoginPage(driver);
    loginPage.goLogin("Evgenkorotkov91", "Evg3jk3!");
    DiskPage diskPage = new DiskPage(driver);
    diskPage.goDisk();
    String heading = diskPage.getHeading();
    Assert.assertEquals("Testfile", "Testfile", heading);
    System.out.println("Файл находится в папке,\nназвание соответствует оригиналу: " + heading);

  }



}
