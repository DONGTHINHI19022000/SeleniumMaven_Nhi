package btlocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;
import java.time.Duration;

public class XpathTuongDoi2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//label[text()=' Remember me']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        //driver.findElement(By.xpath("//span[normalize-space()='Bulk PDF Export']/ancestor::li")).click(); cach 6
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='New Project']")).click();
        driver.findElement(By.xpath("//div[@class='form-group']/descendant::input")).sendKeys("New Project");//cach 7
        //driver.findElement(By.xpath("//button[@class='btn dropdown-toggle bs-placeholder btn-default']/descendant::div")).click();
        driver.findElement(By.xpath("(//div[text()='Select and begin typing'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='search' and @class='form-control'])[1]")).click();
        driver.findElement(By.xpath("(//input[@type='search' and @class='form-control'])[1]")).sendKeys("A");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='search' and @class='form-control'])[1]")).sendKeys("B");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='search' and @class='form-control'])[1]")).sendKeys("C");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-6-0']")).click();
        //driver.findElement(By.xpath("//input[@id='progress_from_tasks']")).click();
        //driver.findElement(By.xpath("//input[@name='progress' and @value='9']")).click();
        driver.findElement(By.xpath("(//select[@id='billing_type']/following::button)[1]")).click();//cach8
        driver.findElement(By.xpath("//a[@id='bs-select-1-1']")).click();
        driver.findElement(By.xpath("(//span[@class='bs-caret']/preceding::div)[49]")).click();//cach8
        driver.findElement(By.xpath("//a[@id='bs-select-2-0']")).click();

        driver.findElement(By.xpath("//input[@id='project_cost']")).click();
        driver.findElement(By.xpath("//input[@id='project_cost']")).sendKeys("10");
        driver.findElement(By.xpath("//label[normalize-space()='Estimated Hours']/following-sibling::input")).sendKeys("50");//cach 9
        driver.findElement(By.xpath("//div[contains(text(),'Admin Example')]")).click();
        driver.findElement(By.xpath("(//button[@type='button']/preceding-sibling::button)[1]")).click();//cach 9
//        driver.findElement(By.xpath("//button[@type='button' and text()='Select All']")).click();
//        driver.findElement(By.xpath("(//div[@class='input-group date']/child::input)[2]")).click();// cach 10
       // driver.findElement(By.xpath("//div[normalize-space()='17']")).click();
        //driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("hello");
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

        Thread.sleep(2000);
        //driver.quit();

    }
}
