import AutomationStore.pages.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static AutomationStore.Utils.DriverFactory.*;

public class Contact {

    ContactUsPage contactUsPage = new ContactUsPage(getDriver());

    @Test
    public void successfullySendMessage() {
        contactUsPage
                .populateEmail("hello@world.com")
                .messageBox("test")
                .selectSubjectHeading(ContactUsPage.SubjectHeading.WEBMASTER.option)
                .populateOrderReference("123456789")
                .attachFile("\\main\\java\\AutomationStore\\Utils\\hello.txt")
                .submit();
        Assert.assertEquals(contactUsPage.successfullySentGetText(), "Your message has been successfully sent to our team.");
    }
}
