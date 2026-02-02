package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");

        String title=driver.getTitle();
        System.out.println("The title is "+title);

        WebElement element1=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(element1.isSelected());

        WebElement element2=driver.findElement(By.xpath("//input[@id='checkbox']"));
        element2.click();

        WebElement element3=driver.findElement(By.xpath("//input[@id='checkbox']"));
        System.out.println(element3.isSelected());

        driver.quit();




        
    }

    
}
