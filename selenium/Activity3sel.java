package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
        String title=driver.getTitle();
        System.out.println(title);
        //WebElement element1=driver.findElement(By.xpath("//input[contains(@id,'username')]"));
        WebElement element1=driver.findElement(By.xpath("//input[@id='username']"));
        element1.sendKeys("admin");
        //WebElement element2=driver.findElement(By.xpath("//input[contains(@id,'password')]"));
        WebElement element2=driver.findElement(By.xpath("//input[@id='password']"));
        element2.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        driver.quit();




    }
    
}
