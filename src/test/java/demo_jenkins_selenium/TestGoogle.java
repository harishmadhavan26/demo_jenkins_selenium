package demo_jenkins_selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGoogle {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogleTest() {

        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}