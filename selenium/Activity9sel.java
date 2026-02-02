package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/keyboard-events");
        String title=driver.getTitle();
        System.out.println(title);

        WebElement e1=driver.findElement(By.xpath("//span[text()='|']"));
        Actions builder=new Actions(driver);
        builder.sendKeys("Dona is the best").sendKeys(e1).build().perform();
        //e1.sendKeys("Dona is the BEST");
        WebElement e2=driver.findElement(By.xpath(".//h1[contains(@class,'mt-3')]"));
        System.out.println(e2.getText());
        driver.quit();
    }
    
}
