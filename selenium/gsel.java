package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gsel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("http://www.google.com");
        String title=driver.getTitle();
        System.out.println(title);

        driver.navigate().to("https://www.wikipedia.org");

        //driver.navigate().forward();

        driver.navigate().back();

        driver.findElement(By.className("gb_Z")).click();
        //element.click();


        driver.quit();
        
    }
    
}
