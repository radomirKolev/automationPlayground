import AutomationStore.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    WebDriver driver;

    @BeforeSuite
    public void setup() {
        driver = DriverFactory.getChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goToStartingPage() {
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @AfterSuite
    public void tearDown() {
        driver.close();
    }
}
