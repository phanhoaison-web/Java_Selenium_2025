package Bai6_WebElement;

import Bai5_Locators.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ManagementLeads extends BaseTest {

    public static void testLoginCRM() throws InterruptedException {
        driver.get(LocatorsCRM.URL);
        System.out.println("Verify header login :" + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys(LocatorsCRM.EMAIL);
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys(LocatorsCRM.PASSWORD);
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
        Thread.sleep(2000);
        System.out.println("Verify dashboard option :" + driver.findElement(By.xpath(LocatorsCRM.verifyDashboardOption)).isDisplayed());
        destroyDriver();
    }

    public static void testOpenMenuLeads()throws InterruptedException {
        driver.get(LocatorsCRM.URL);
        System.out.println("Verify header login :" + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys(LocatorsCRM.EMAIL);
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys(LocatorsCRM.PASSWORD);
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
        Thread.sleep(2000);
        System.out.println("Verify dashboard option :" + driver.findElement(By.xpath(LocatorsCRM.verifyDashboardOption)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.menuLeads)).click();
        driver.findElement(By.xpath(LocatorsCRM.btnLeadsSummery)).click();
        System.out.println("Verify header Leads Summary :" + driver.findElement(By.xpath(LocatorsCRM.headerLeadsSummary)).isDisplayed());
        destroyDriver();
    }

    public static void testAddNewLead() throws InterruptedException {
        driver.get(LocatorsCRM.URL);
        System.out.println("Verify header login :" + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys(LocatorsCRM.EMAIL);
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys(LocatorsCRM.PASSWORD);
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
        Thread.sleep(3000);
        System.out.println("Verify dashboard option :" + driver.findElement(By.xpath(LocatorsCRM.verifyDashboardOption)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.menuLeads)).click();
        driver.findElement(By.xpath(LocatorsCRM.btnLeadsSummery)).click();
        Thread.sleep(2000);
        System.out.println("Verify header Leads Summary :" + "h4".equals(driver.findElement(By.xpath(LocatorsCRM.headerLeadsSummary)).getTagName()));

        driver.findElement(By.xpath(LocatorsCRM.btnNewLead)).click();
        System.out.println("Verify header Add new Lead :" + "h4".equals(driver.findElement(By.xpath(LocatorsCRM.headerAddNewLead)).getTagName()));

        driver.findElement(By.xpath(LocatorsCRM.dropdownStatus)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchStatus)).clear();
        Thread.sleep(1000);
        WebElement elementStatus = driver.findElement(By.xpath(LocatorsCRM.inputSearchStatus));
        elementStatus.sendKeys("Active");
        elementStatus.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(LocatorsCRM.dropdownSource)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchSource)).clear();
        Thread.sleep(1000);
        WebElement elementSource  =  driver.findElement(By.xpath(LocatorsCRM.inputSearchSource));
        elementSource.sendKeys("Facebook");
        elementSource.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(LocatorsCRM.dropdownAssigned)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchAssigned)).clear();
        Thread.sleep(1000);
        WebElement elementAssigned = driver.findElement(By.xpath(LocatorsCRM.inputSearchAssigned));
        elementAssigned.sendKeys("Admin Anh Tester");
        elementAssigned.sendKeys(Keys.ENTER);

        WebElement elementTag = driver.findElement(By.xpath(LocatorsCRM.leadDropdownTags));
        elementTag.click();
        elementTag.sendKeys("Selenium");
        elementTag.sendKeys(Keys.TAB);

        driver.findElement(By.xpath(LocatorsCRM.inputName)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputName)).sendKeys("Leads_Test_2910");

        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputAddress)).sendKeys("Đại Mỗ - Hà Nội");

        driver.findElement(By.xpath(LocatorsCRM.inputPosition)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPosition)).sendKeys("123456");

        driver.findElement(By.xpath(LocatorsCRM.inputCity)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Tp Hà Nội");

        driver.findElement(By.xpath(LocatorsCRM.inputEmailAddress)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmailAddress)).sendKeys("tphn@gmail.com");

        driver.findElement(By.xpath(LocatorsCRM.inputState)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Hà Nội");

        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("tphn.test.com.vn");

        driver.findElement(By.xpath(LocatorsCRM.dropdownCountry)).click();
        WebElement elementCountry = driver.findElement(By.xpath(LocatorsCRM.inputSearchCountry));
        elementCountry.click();
        elementCountry.sendKeys("Vietnam");
        elementCountry.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(LocatorsCRM.inputPhone)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPhone)).sendKeys("0987654321");

        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("100000");

        driver.findElement(By.xpath(LocatorsCRM.inputLeadValue)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputLeadValue)).sendKeys("100");

        driver.findElement(By.xpath(LocatorsCRM.dropdownDefaultLanguage)).click();
        Thread.sleep(1000);
        WebElement elementDefaultLanguage = driver.findElement(By.xpath(LocatorsCRM.inputSearchDefaultLanguage));
        elementDefaultLanguage.click();
        elementDefaultLanguage.sendKeys("Vietnamese");
        elementDefaultLanguage.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys("TpHNJSC");

        driver.findElement(By.xpath(LocatorsCRM.inputDescription)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputDescription)).sendKeys("Test thêm mới new lead");

        driver.findElement(By.xpath(LocatorsCRM.btnSaveLead)).click();
        Thread.sleep(3000);
        System.out.println("Verify add new Lead success :" + "Lead Information".equals(driver.findElement(By.xpath(LocatorsCRM.headerNewLeadSuccess)).getText()));
        destroyDriver();
    }


    public static void main(String[] args) throws InterruptedException {
        createdDriver();
        testLoginCRM();
        testOpenMenuLeads();
        testAddNewLead();
    }
}
