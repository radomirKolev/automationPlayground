package AutomationStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FooterSection {
    private WebDriver driver;

    public FooterSection(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
