package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity5sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        WebElement element=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(element.isDisplayed());

        if(element.isDisplayed()){
            driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        }else{
            System.out.println("Check box not visible");
        }
        WebElement element2=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(element2.isDisplayed());

        driver.quit();
        
    }
    
}
