package test;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAtomatic {
    public static WebDriver driver;

    By searchBarLocat = By.xpath("//input[@class='gLFyf gsfi']");
    By btnSearchLocat = By.xpath("//input[@name='btnK']");

    @Before
    public void before(){
        driver = new FirefoxDriver();
        driver.get("https://www.google.com.co");
    }
    @Test
    public void test() {
            driver.findElement(searchBarLocat).sendKeys("Champions League final");
            driver.findElement(btnSearchLocat).click();
    }
    @After
    public void after(){
        driver.quit();
    }
}