package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Pages {

    public WebDriver driver;

    By search_Textbox = By.xpath(("//div/input[@name='q']"));
    By firstName_Textbox = By.id("fname");
    By secondName_Textbox = By.id("lname");
    By submit_Button = By.xpath(("//input[@type='submit']"));
    By form_Heading = By.xpath("//body/h1");

    public Pages(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String text) {
        driver.findElement(search_Textbox).sendKeys(text);
        driver.findElement(search_Textbox).sendKeys(Keys.RETURN);
    }

    public void enter_Details(String fname , String lname) {
        driver.switchTo().frame("iframeResult");
        driver.findElement(firstName_Textbox).clear();
        driver.findElement(firstName_Textbox).sendKeys(fname);
        driver.findElement(secondName_Textbox).clear();
        driver.findElement(secondName_Textbox).sendKeys(lname);
        driver.findElement(submit_Button).click();

    }
    public void validate_Form(String form){

        Assert.assertEquals(driver.findElement(form_Heading).getText(),form);

    }
}