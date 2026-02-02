package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.l86400.component.selenium.core.web.driver.WebDriver;

public class Activity13sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        String title=driver.getTitle();
        System.out.println(title);

        List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
        List<WebElement> rows_3=driver.findElements(By.xpath("//table/tbody/tr[3]"));
        List<WebElement> cols=driver.findElements(By.xpath("//table/thead/tr/th"));
        List<WebElement> cols_2=driver.findElements(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println(rows.size());
        System.out.println(cols.size());

        

        for (WebElement i:rows_3){
            System.out.println(i.getText());
        }
        for (WebElement i1:cols_2){
            System.out.println(i1.getText());
        }

        
        

        driver.quit();






    }
    
}
