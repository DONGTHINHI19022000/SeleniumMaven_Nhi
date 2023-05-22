package WebElementAndDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webElement extends Base{
    public static void main(String[] args) {
        createBrowser();
        driver.get("https://crm.anhtester.com/admin/clients");
        WebElement a=driver.findElement(By.id("email"));
        a.sendKeys("admin@example.com");
        a.clear();
        a.sendKeys("admin@example.com");
        WebElement login=driver.findElement(By.id("password"));
        login.sendKeys("123456");

        WebElement checkBoxx=driver.findElement(By.xpath("//input[@id='remember']"));
        System.out.println("hieenr thij:"+checkBoxx.isSelected());
        if(checkBoxx.isSelected()==false){
            driver.findElement(By.xpath("//input[@id='remember']")).click();

        }
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

        WebElement cus=driver.findElement(By.xpath("//span[normalize-space()='Customers']"));
        cus.click();
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();

        //quitBrowser();


    }

}
