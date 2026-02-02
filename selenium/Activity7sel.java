package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity7sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");

        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        WebElement element1=driver.findElement(By.xpath("//input[@id='textInput']"));
        System.out.println(element1.isEnabled());

        WebElement element2=driver.findElement(By.xpath("//button[text()='Enable Input']"));
        //WebElement element2=driver.findElement(By.id("textInputButton"));
        element2.click();

        WebElement element3=driver.findElement(By.xpath("//input[@id='textInput']"));
        element3.isEnabled();



        driver.quit();
    }
    
}
