import AutomationStore.Utils.DriverFactory;
import AutomationStore.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MainTest extends BaseTest {
    WebDriver driver = DriverFactory.getChromeDriver();
    HomePage home = new HomePage(driver);

    @Test
    public void test() {
        home.search();
    }
}
