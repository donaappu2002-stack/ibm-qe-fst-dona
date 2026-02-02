package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-attributes");

        String title=driver.getTitle();
        System.out.println(title);

        WebElement input_name=driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]"));
        WebElement input_email=driver.findElement(By.cssSelector("input[id$='-email']"));
        WebElement input_date=driver.findElement(By.cssSelector("input[name*='-event-date-']"));
        WebElement input_details=driver.findElement(By.cssSelector("textarea[name*='-additional-details-']"));
        WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
        input_name.sendKeys("Dona");
        input_email.sendKeys("donaappu2002@gmail.com");
        input_date.sendKeys("2026-10-28");
        input_details.sendKeys("I am here for the event");
        submit.click();

        WebElement message=driver.findElement(By.xpath("//h3[@id='action-confirmation']"));
        System.out.println(message.getText());

        driver.quit();




    }
    
}
