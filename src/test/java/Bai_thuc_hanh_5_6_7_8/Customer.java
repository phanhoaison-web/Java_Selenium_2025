package Bai_thuc_hanh_5_6_7_8;

import Bai5_Locators.LocatorsCRM;
import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Customer extends BaseTest {

    public static void loginCRM() throws InterruptedException {
        System.out.println("Verify header login :" + driver.findElement(By.xpath(LocatorsCRM.headerLogin)).isDisplayed());
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys(LocatorsCRM.EMAIL);
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys(LocatorsCRM.PASSWORD);
        driver.findElement(By.xpath(LocatorsCRM.btnLogin)).click();
        Thread.sleep(3000);
        System.out.println("Verify dashboard option :" + driver.findElement(By.xpath(LocatorsCRM.verifyDashboardOption)).isDisplayed());
    }

    public static void addNewCustomer(String customerName) throws InterruptedException {
        driver.findElement(By.xpath(LocatorsCRM.inputCompanyC)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputCompanyC)).sendKeys(customerName);
        driver.findElement(By.xpath(LocatorsCRM.inputVATC)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputVATC)).sendKeys("10");
        driver.findElement(By.xpath(LocatorsCRM.inputPhoneC)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPhoneC)).sendKeys("0987654123");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsiteC)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputWebsiteC)).sendKeys("https://tester.com");


        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroups)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchGroups)).sendKeys("Group Maison", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.dropdownGroups)).click();


        driver.findElement(By.xpath(LocatorsCRM.dropdownCurrency)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCurrency)).sendKeys("USD", Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.dropdownLanguage)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchOption("German"))).click();

        driver.findElement(By.xpath(LocatorsCRM.inputAddresC)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputAddresC)).sendKeys("Hoàng Liệt");

        driver.findElement(By.xpath(LocatorsCRM.inputCityC)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputCityC)).sendKeys("Hà Nội");

        driver.findElement(By.xpath(LocatorsCRM.inputStateC)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputStateC)).sendKeys("Hà Nội");

        driver.findElement(By.xpath(LocatorsCRM.inputZipcode)).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputZipcode)).sendKeys("100000");


        driver.findElement(By.xpath(LocatorsCRM.dropdownCountryC)).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountryC)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCountryC)).sendKeys("China", Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath(LocatorsCRM.btnSaveCustomer)).click();
        Thread.sleep(2000);
    }

    public static void searchCustomer(String customerName) throws InterruptedException {
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomer)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputSearchCustomer)).sendKeys(customerName);
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        createdDriver();
        driver.get(LocatorsCRM.URL);
        loginCRM();
        driver.findElement(By.xpath(LocatorsCRM.menuCustomer)).click();
        int totalCustomer = Integer.parseInt( driver.findElement(By.xpath(LocatorsCRM.totalCustomers)).getText());
        System.out.println("Total Customer : " + totalCustomer);
        driver.findElement(By.xpath(LocatorsCRM.addNewCustomer)).click();

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String date= localDateTime.format(formatter);

        addNewCustomer("JSC_DN" + date);
        searchCustomer("JSC_DN" + date);

        int totalCustomerAfterAddNew = Integer.parseInt( driver.findElement(By.xpath(LocatorsCRM.totalCustomers)).getText());
        System.out.println("Total Customer after add new : " + totalCustomerAfterAddNew);
        if(totalCustomerAfterAddNew == totalCustomer + 1 ){
            System.out.println("Customer total is correct!");
        }else {
            System.out.println("Failed Customer total is correct. Not equal to " +  totalCustomer + 1 );
        }

        String comapyNameAddNew = driver.findElement(By.xpath(LocatorsCRM.firstRowCustomerTable)).getText();
        if(comapyNameAddNew.equals("JSC_DN"+ date)){
            System.out.println("Customer new is correct!");
        }else {
            System.out.println("Customer new is incorrect" );
        }

        destroyDriver();
    }
}
