package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Activity16sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");
        String title=driver.getTitle();
        System.out.println(title);

        WebElement dropdown=driver.findElement(By.xpath("//select"));
        Select list = new Select(dropdown);

        list.selectByVisibleText("Two");
        //pause(1000);
        list.selectByIndex(3);
        list.selectByValue("four");

        	
        List<WebElement> options = list.getOptions();
        	
        //List<WebElement> allSelected = list.getAllSelectedOptions();
        for(int i=1;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }

        driver.quit();



    }
    
}
