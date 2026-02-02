package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity11sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/dynamic-controls");
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        WebElement element=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(element.isDisplayed());

        if(element.isDisplayed()){
            driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
            wait.until(ExpectedConditions.invisibilityOf(element));
        }else{
            System.out.println("Check box not visible");
        }
        WebElement element2=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(element2.isDisplayed());

        driver.quit();
        
    }
    
}
