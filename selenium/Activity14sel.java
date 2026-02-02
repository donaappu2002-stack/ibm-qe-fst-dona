package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity14sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");

        String title=driver.getTitle();
        System.out.println(title);

        List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
        List<WebElement> row_5=driver.findElements(By.xpath("//table/tbody/tr[5]/td[2]"));
        List<WebElement> price_col=driver.findElements(By.xpath("//table/thead/tr/th[5]"));

        System.out.println(rows.size());
        System.out.println(cols.size());

        for(WebElement i:row_5){
            System.out.println(i.getText());
        }
        for(WebElement i1:price_col){
            i1.click();
        }
       
         row_5=driver.findElements(By.xpath("//table/tbody/tr[5]/td[2]"));
        for(WebElement i:row_5){
            System.out.println(i.getText());
        }

        driver.quit();





    }
    
}
