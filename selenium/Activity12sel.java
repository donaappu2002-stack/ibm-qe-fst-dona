package selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity12sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/webelements/dynamic-content");

        String title=driver.getTitle();
        System.out.println(title);

        WebElement e1=driver.findElement(By.xpath("//button[@id='genButton']"));
        e1.click();

        if(wait.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='word']"),"release"))){
            System.out.println(driver.findElement(By.xpath("//h2[@id='word']")).getText());
        };

        driver.quit();








        
    }
    
}
