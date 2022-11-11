import org.junit.Test;

public class MainTest extends BeforeAfter {

  @Test
    public void getStart() {
    MainPage mainPage = new MainPage();
    mainPage.goLogIn();
    LoginPage loginPage = new LoginPage();
    loginPage.goLogin("Evgenkorotkov91", "Evg3jk3!");
    DiskPage diskPage = new DiskPage();
    diskPage.goDisk();


  }
}
