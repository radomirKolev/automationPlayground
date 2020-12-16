package AutomationStore.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Properties;

public class DriverFactory {

    private static Properties prop;
    private static WebDriver driver;
    private static WebDriverWait wait;


    private DriverFactory() {
        // prevents instantiation
    }

    public static WebDriver getDriver()  {
        try {
            prop = PropertiesReader.readPropertiesFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (driver == null) {
            switch (prop.getProperty("driver").toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", prop.getProperty("driverlocation"));
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                default:
                    driver = new FirefoxDriver();
                    break;
            }
        }
        return driver;
    }

    public static WebDriverWait getWebDriverWait() throws IOException {
        if (wait == null) {
            wait = new WebDriverWait(getDriver(), 5);
        }
        return wait;
    }
}
