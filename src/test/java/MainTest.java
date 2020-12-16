import AutomationStore.pages.HomePage;
import org.testng.annotations.Test;

import static AutomationStore.Utils.DriverFactory.*;

public class MainTest extends BaseTest {
    HomePage home = new HomePage(getDriver());

    @Test
    public void test() {
        home.search();
    }
}
