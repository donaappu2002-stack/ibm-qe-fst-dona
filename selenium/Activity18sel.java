package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity18sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");

        String title=driver.getTitle();
        System.out.println(title);

        WebElement alertButton=driver.findElement(By.id("simple"));
        alertButton.click();

        Alert simpleAlert=driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();
        driver.quit();

        
        
    }
    
}
