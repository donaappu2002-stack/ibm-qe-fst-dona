package selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/selects");

        String title=driver.getTitle();
        System.out.println(title);

        WebElement dropdown=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/section/div[2]/select"));
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();

        select.selectByVisibleText("HTML");
        select.selectByIndex(3);
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByValue("node");
        select.deselectByIndex(4);

        driver



    }
}
