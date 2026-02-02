package selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;


public class Activity20sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
        String title=driver.getTitle();
        System.out.println(title);

        WebElement alertbutton=driver.findElement(By.id("prompt"));
        alertbutton.click();

        Alert promptAlert=driver.switchTo().alert();
        System.out.println(promptAlert.getText());

        promptAlert.sendKeys("Awesome!");
        promptAlert.accept();

        driver.quit();
    }
    
}
