package Bai7_WebDriver;


import Bai5_Locators.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class ManagementTask extends BaseTest {


    public static void testOpenMenuTask() throws InterruptedException {
        driver.get(LocatorsCRM.URL);
        System.out.println("Verify header login :" + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys(LocatorsCRM.EMAIL);
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys(LocatorsCRM.PASSWORD);
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
        Thread.sleep(2000);
        System.out.println("Verify dashboard option :" + driver.findElement(By.xpath(LocatorsCRM.verifyDashboardOption)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.menuTasks)).click();
        Thread.sleep(2000);
        System.out.println("Verify header Leads Summary :" + driver.findElement(By.xpath(LocatorsCRM.headerTasksSummary)).isDisplayed());

        destroyDriver();
    }

    public static void testAddNewTask()throws InterruptedException{
        driver.get(LocatorsCRM.URL);
        System.out.println("Verify header login :" + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys(LocatorsCRM.EMAIL);
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys(LocatorsCRM.PASSWORD);
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
        Thread.sleep(1000);
        System.out.println("Verify dashboard option :" + driver.findElement(By.xpath(LocatorsCRM.verifyDashboardOption)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.menuTasks)).click();
        Thread.sleep(1000);
        System.out.println("Verify header Leads Summary :" + driver.findElement(By.xpath(LocatorsCRM.headerTasksSummary)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.btnNewTask)).click();
        Thread.sleep(1000);
        System.out.println("Verify header Add new Lead :" + "h4".equals(driver.findElement(By.xpath(LocatorsCRM.headerAddNewTask)).getTagName()));

        driver.findElement(By.xpath(LocatorsCRM.taskCheckBoxPublic)).click();

        driver.findElement(By.xpath(LocatorsCRM.inputSubject)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputSubject)).sendKeys("HNJSC");

        driver.findElement(By.xpath(LocatorsCRM.inputHourlyRate)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputHourlyRate)).sendKeys("12");

        driver.findElement(By.xpath(LocatorsCRM.inputStartDate)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputStartDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputStartDate)).sendKeys("30-10-2025");
        driver.findElement(By.xpath(LocatorsCRM.inputStartDate)).sendKeys(Keys.TAB);

        driver.findElement(By.xpath(LocatorsCRM.inputDuaDate)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputDuaDate)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputDuaDate)).sendKeys("30-10-2026");
        driver.findElement(By.xpath(LocatorsCRM.inputDuaDate)).sendKeys(Keys.TAB);

//        driver.findElement(By.xpath(LocatorsCRM.dropdownPriority)).click();
//        Thread.sleep(2000);
//        WebElement elementPriority = driver.findElement(By.xpath(LocatorsCRM.selectedPriority));
//        elementPriority.click();
//        elementPriority.sendKeys("Hight");
//        elementPriority.sendKeys(Keys.ENTER);
//
//        driver.findElement(By.xpath(LocatorsCRM.dropdownRepeatEvery)).click();
//        driver.findElement(By.xpath(LocatorsCRM.dropdownRepeatEvery)).clear();
//        Thread.sleep(2000);
//        WebElement elementRepeatEvery = driver.findElement(By.xpath(LocatorsCRM.selectedRepeatEvery));
//        elementRepeatEvery.click();
//        elementRepeatEvery.sendKeys("Week");
//        elementRepeatEvery.sendKeys(Keys.ENTER);

//        driver.findElement(By.xpath(LocatorsCRM.dropdownRelatedTo)).click();
//        Thread.sleep(2000);
//        WebElement elementRelatedTo = driver.findElement(By.xpath(LocatorsCRM.selectedRelatedTo));
//        elementRelatedTo.click();
//        elementRelatedTo.sendKeys("Lead");
//        elementRelatedTo.sendKeys(Keys.ENTER);


        driver.findElement(By.xpath(LocatorsCRM.dropdownAssignees)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchAssignees)).clear();
        Thread.sleep(1000);
        WebElement elementAssignees = driver.findElement(By.xpath(LocatorsCRM.inputSearchAssignees));
        elementAssignees.sendKeys("Admin Anh Tester");
        driver.findElement(By.xpath(LocatorsCRM.dropdownAssignees)).click();

        WebElement elementTag = driver.findElement(By.xpath(LocatorsCRM.taskDropdownTags));
        elementTag.click();
        elementTag.clear();
        Thread.sleep(1000);
        elementTag.sendKeys("JSC_NEW");
//
//        driver.findElement(By.xpath(LocatorsCRM.clickTaskDescription)).click();
//        driver.findElement(By.xpath(LocatorsCRM.inputTaskDescription)).clear();
//        driver.findElement(By.xpath(LocatorsCRM.inputTaskDescription)).sendKeys("Test thêm mới new Task");

        Thread.sleep(3000);

        driver.findElement(By.xpath(LocatorsCRM.btnSaveTask)).click();
        Thread.sleep(3000);

        System.out.println("Verify add new Lead success :" + driver.findElement(By.xpath(LocatorsCRM.headerNewTaskSuccess)).getText());
        destroyDriver();
    }

    public static void main(String[] args) throws Exception{
        createdDriver();
        testOpenMenuTask();
        testAddNewTask();
    }
}
