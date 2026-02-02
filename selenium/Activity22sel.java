package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Activity22sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/popups");
        System.out.println("Title is"+ driver.getTitle());
        WebElement btn=driver.findElement(By.id("launcher"));
        btn.click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//*[@id=\"signInForm\"]/button")).click();

        String message = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div")).getText();
        System.out.println("Login message: " + message);

        driver.quit();



    }
}