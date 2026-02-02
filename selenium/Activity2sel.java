package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
        String title=driver.getTitle();
        System.out.println(title);
        WebElement element1=driver.findElement(By.name("username"));
        element1.sendKeys("admin");
        WebElement element2=driver.findElement(By.name("password"));
        element2.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        driver.quit();




    }
    
}
