package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity8sel {
    public static void main(String[] args) {
        
    WebDriver driver=new FirefoxDriver();
    driver.get("https://training-support.net/webelements/mouse-events");
    String title=driver.getTitle();
    System.out.println(title);

    Actions builder = new Actions(driver);
    WebElement e1=driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
    WebElement e2=driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
    WebElement e3=driver.findElement(By.xpath("//h1[text()='src']"));
    WebElement e4=driver.findElement(By.xpath("//h1[text()='target']"));

    builder.click(e1).moveToElement(e2).click(e2). build().perform();
    WebElement e5=driver.findElement(By.xpath("//p[@id='result']"));
    System.out.println(e5.getText());

    builder.doubleClick(e3).build().perform();
   
    System.out.println(e5.getText());

    builder.contextClick(e4).build().perform();
    builder.click(driver.findElement(By.xpath("//span[text()='Open']"))).pause(1000).build().perform();
    WebElement e6=driver.findElement(By.xpath("//p[@id='result']"));
    System.out.println(e6.getText());

    //driver.quit();
    }
}