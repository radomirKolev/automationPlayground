package AutomationStore.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    WebDriver driver;

    // Locators under this lane

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "id_order")
    WebElement orderReference;

    @FindBy(id = "fileUpload")
    WebElement fileUpload;

    @FindBy(id = "submitMessage")
    WebElement submitButton;

    @FindBy(id = "id_contact")
    WebElement subjectHeading;

    @FindBy(id = "fileUpload")
    WebElement attachFile;

    @FindBy(xpath = "//textarea[@name=\"message\"]")
    WebElement messageBox;

    @FindBy(xpath="//p[@class=\"alert alert-success\"]")
    WebElement successfullySentMessage;


    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    public ContactUsPage populateEmail(String value) {
        email.clear();
        email.sendKeys(value);
        return this;
    }

    public ContactUsPage populateOrderReference(String value) {
        orderReference.clear();
        orderReference.sendKeys(value);
        return this;
    }

    public ContactUsPage submit() {
        submitButton.click();
        return this;
    }

    public ContactUsPage selectSubjectHeading(String option) {
        Select select = new Select(subjectHeading);
        select.selectByVisibleText(option);
        return this;
    }

    public ContactUsPage attachFile(String path) {
        attachFile.sendKeys(path);
        return this;
    }

    public ContactUsPage messageBox(String value) {
        messageBox.sendKeys(value);
        return this;
    }

    public ContactUsPage successfullySentGetText(){
        successfullySentMessage.getText();
        return this;
    }

    public enum SubjectHeading {
        CUST_SERVICE("Customer service"),
        WEBMASTER("Webmaster");

        public final String option;

        SubjectHeading(String option) {
            this.option = option;
        }
    }
}
