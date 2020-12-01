import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MainPage extends BaseTest {

    @Test
    public void test(){
        WebElement search = driver.findElement(By.id("search_query_top"));
        search.sendKeys("hello");
    }
}
