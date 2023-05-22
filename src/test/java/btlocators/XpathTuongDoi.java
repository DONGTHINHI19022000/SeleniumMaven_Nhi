package btlocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTuongDoi {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@example.com");//cach 1
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//label[text()=' Remember me']")).click();//cach 2
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'btn btn-primary mright5 test pull-left display-block')]")).click();//cach 3
        driver.findElement(By.xpath("//input[starts-with(@class,'form-control')]")).sendKeys("TeamOne1");//cach 4
        driver.findElement(By.xpath("//input[@class='form-control' and @id='vat']")).sendKeys("123");//cach 5
        driver.findElement(By.xpath("//input[@class='form-control' and @id='phonenumber']")).sendKeys("1111111");
        driver.findElement(By.xpath("//input[@class='form-control' and @id='website']")).sendKeys("teamone.studio");
        driver.findElement(By.xpath("//i[@class='fa fa-plus']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nhom002");
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default bs-placeholder']/ancestor::form")).click(); ?
        driver.findElement(By.xpath("//div[text()='Nothing selected']")).click();
        driver.findElement(By.xpath("//input[@class='form-control' and @role='combobox' and @type='search']")).sendKeys("Nhom02");
        driver.findElement(By.xpath("//a[@id='bs-select-1-0']")).click();
        driver.findElement(By.xpath("//div[@class='filter-option']")).click();
        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default bs-placeholder']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-2-3']")).click();
        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default']//div[@class='filter-option-inner-inner'][normalize-space()='System Default']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-3-20']")).click();
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Ha Noi");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Ha noi");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Good");
        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("00001");
        driver.findElement(By.xpath("//div[@class='filter-option-inner-inner' and text()='Nothing selected']")).click();
        driver.findElement(By.xpath("//a[@id='bs-select-4-243']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary only-save customer-form-submiter']")).click();
        Thread.sleep(3000);
        driver.quit();



    }
}