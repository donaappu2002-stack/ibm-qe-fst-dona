package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class Activity1sel {

    public static void main (String[] args){

    WebDriver driver=new FirefoxDriver();
    driver.get("https://training-support.net");
    String title=driver.getTitle();
    System.out.println(title);

    driver.findElement(By.linkText("About Us")).click();
    System.out.println("New page title is: " + driver.getTitle());



    driver.quit();


    }
}
