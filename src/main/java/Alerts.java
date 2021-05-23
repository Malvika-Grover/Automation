import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys("Malvika Grover");       // Sending keys to text_box
        driver.findElement(By.id("alertbtn")).click();                                 // Clicking on Alert Button
        driver.switchTo().alert().accept();                                            // Accept the alert
        Thread.sleep(1000L);
        driver.findElement(By.id("confirmbtn")).click();                               // Clicking on Confirm Button
        driver.switchTo().alert().dismiss();                                           // Dismiss/Cancel the alert
    }

}
