package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");
        String title=driver.getTitle();
        System.out.println(title);

        Actions builder=new Actions(driver);
        WebElement e1=driver.findElement(By.xpath("//img[@id='ball']"));
        WebElement e2=driver.findElement(By.xpath("//div[@id='dropzone1']"));
        WebElement e3=driver.findElement(By.xpath("//div[@id='dropzone2']"));
        //WebElement e4=driver.findElement(By.xpath("//span[@class='dropzone-text']"));
        //WebElement e5=driver.findElement(By.xpath("//span[text()='Dropped!']"));

        builder.click(e1).pause(1000).dragAndDrop(e1,e2).pause(3000).build().perform();
        if((e2.findElement(By.xpath("//span[text()='Dropped!']")).getText()).equals("Dropped!")){
            System.out.println("The ball is dropped in zone1");
        }else{
            System.out.println("The ball is not in zone1");
        }
        // if((e3.findElement(By.xpath("//span[@class='dropzone-text svelte-lit24y']")).getText())=="Dropped!"){
        //     System.out.println("The ball is dropped in zone 2");
        // }else{
        //     System.out.println("The ball was not dropped in zone 2");
        // }

        builder.click(e1).pause(1000).dragAndDrop(e1, e3).pause(1000).build().perform();
        if((e3.findElement(By.xpath("//span[@class='dropzone-text svelte-lit24y']")).getText()).equals("Dropped!")){
            System.out.println("The ball is dropped in zone 2");
        }else{
            System.out.println("The ball was not dropped in zone 2");
        }

        driver.quit();

        
    }
    
}
