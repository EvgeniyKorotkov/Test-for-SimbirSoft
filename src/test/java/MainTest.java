import org.junit.Assert;
import org.junit.Test;

public class MainTest extends BeforeAfter {
  final String USER = "Evgenkorotkov91";
  final String PASSWORD = "Evg3jk3!";

  @Test
    public void getStart() {
    MainPage mainPage = new MainPage();
    mainPage.goLogIn().getLogin(USER, PASSWORD).goDisk();
    DiskPage diskPage = new DiskPage(driver);
    String heading = diskPage.getHeading();
    Assert.assertEquals("Testfile", "Testfile", heading);
    System.out.println("Файл находится в папке,\nназвание соответствует оригиналу: " + heading);

  }



}
