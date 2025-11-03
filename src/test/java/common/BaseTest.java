package common;

import Bai5_Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public static void createdDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }

    public static  void destroyDriver() {
        if(driver != null) {
            driver.quit();
        }
    }

    public static void login() throws InterruptedException {
        driver.get(LocatorsCRM.URL);
        System.out.println("Verify header login :" + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys(LocatorsCRM.EMAIL);
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys(LocatorsCRM.PASSWORD);
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
        Thread.sleep(3000);
        System.out.println("Verify dashboard option :" + driver.findElement(By.xpath(LocatorsCRM.verifyDashboardOption)).isDisplayed());
    }
}
