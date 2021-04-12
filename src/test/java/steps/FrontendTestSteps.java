package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.groovy.json.internal.JsonParserUsingCharacterSource;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Pages;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FrontendTestSteps {
    WebDriver driver = UIDriver.getDriver();

    String title = null;
    Pages pages = new Pages(driver);


    @Given("I am on {string} website")
    public void onWebsite(String website_link) {
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.get(website_link);
    }

    @When("I search for {string}")
    public void iSearch(String searchWord) {
        pages.search(searchWord);
    }
    @And("user enter {string} and {string}")
    public void enter_Details(String fname, String sname) {
        pages.enter_Details(fname,sname);
    }

    @And("{string} form is displayed")
    public void  form_Validation(String form) {
        pages.validate_Form(form);
    }

    @And("I click on {string} link")
    public void iClickOnLink(String link) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.partialLinkText(link)).click();
    }
    @And("{string} is displayed")
    public void validateTitle(String title) {
        Assert.assertEquals(driver.getTitle(),title);
        System.out.println(driver.getTitle());
    }

}
