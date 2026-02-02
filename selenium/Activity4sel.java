package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Activity4sel {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
        String title=driver.getTitle();
        System.out.println(title);

        //WebElement element1=driver.findElement(By.tagName("h3"));
        WebElement element1=driver.findElement(By.xpath("//h3[text()='Heading #3']"));
        String text=element1.getText();
        System.out.println("The text in h3: "+text);
        WebElement element2=driver.findElement(By.xpath("//h5[text()='Heading #5']"));
        String color=element2.getCssValue("color");
        System.out.println("The color of h5: "+color);
        WebElement element3=driver.findElement(By.xpath("//button[text()='Purple']"));
        String classname=element3.getAttribute("class");
        System.out.println("Classnames:"+classname);

        WebElement element4=driver.findElement(By.xpath("//button[text()='Slate']"));
        String text2=element4.getText();
        System.out.println("The text of the element4: "+text2);
       
        

        driver.quit();


    }
    
}


// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
// import org.openqa.selenium.support.Color;

// public class Activity4sel {
//     public static void main(String[] args) {
//         // Create a new instance of the Firefox driver
//         WebDriver driver = new FirefoxDriver();

//         // Open the page
//         driver.get("https://training-support.net/webelements/target-practice");
//         // Print the title of the page
//         System.out.println("Page title: " + driver.getTitle());

//         // Find the 3rd header and print its text
//         String thirdHeaderText = driver.findElement(By.xpath("//h3[contains(text(), '#3')]")).getText();
//         System.out.println(thirdHeaderText);
//         // Find the 5th header and print its color
//         Color fifthHeaderColor = Color.fromString(driver.findElement(By.xpath("//h5[contains(text(), '#5')]")).getCssValue("color"));
//         System.out.println("Color as RGB: " + fifthHeaderColor.asRgb());
//         System.out.println("Color as hexcode: " + fifthHeaderColor.asHex());

//         // Find the violet button and print its classes
//         String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
//         System.out.println(purpleButtonClass);
//         // Find the grey button and print its text
//         String slateButtonText = driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText();
//         System.out.println(slateButtonText);

//         // Close the browser
//         driver.quit();
//     }
// }
