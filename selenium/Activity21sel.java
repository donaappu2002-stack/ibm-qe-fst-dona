package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21sel {

    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            // 1) Create a new instance of the Firefox driver
            driver = new FirefoxDriver();

            // 2) Create the Wait object
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // 3) Open the page
            driver.get("https://training-support.net/webelements/tabs");

            // 4) Basic info
            System.out.println("Page title: " + driver.getTitle());
            String parentHandle = driver.getWindowHandle();
            System.out.println("Parent tab: " + parentHandle);

            // 5) Click to open a new tab
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open A New Tab']"))).click();

            // 6) Wait for second tab, then switch to the new one deterministically
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            switchToNewWindow(driver, Set.of(parentHandle));
            System.out.println("After first open - current tab: " + driver.getWindowHandle());

            // 7) Wait for elements on new tab
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]")));

            System.out.println("New Page title: " + driver.getTitle());
            System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());

            // 8) Open another tab from the second tab
            driver.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();

            // 9) Wait for third tab, switch deterministically again
            wait.until(ExpectedConditions.numberOfWindowsToBe(3));
            switchToNewWindow(driver, driver.getWindowHandles()); // We'll pass all current to compute delta below

            // ... perform any checks on the third tab if needed ...

        } finally {
            // 10) Always quit the driver
            if (driver != null) {
                driver.quit();
            }
        }
    }

    /**
     * Switches to the newest window by comparing current handles with a known set.
     * If you pass the set of handles before opening a new window, it will switch to the delta.
     */
    private static void switchToNewWindow(WebDriver driver, Set<String> knownHandlesBeforeOpen) {
        Set<String> currentHandles = driver.getWindowHandles();
        for (String h : currentHandles) {
            if (!knownHandlesBeforeOpen.contains(h)) {
                driver.switchTo().window(h);
                return;
            }
        }
        // Fallback: if not found via delta (shouldn't happen if waits are correct),
        // switch to last handle from the current set.
        for (String h : currentHandles) {
            driver.switchTo().window(h);
        }
    }
}