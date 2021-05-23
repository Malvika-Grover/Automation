import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("checkBoxOption1")).click();                                   // Click checkbox
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());          // Print true if it's clicked, otherwise false
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());           // Check if it is checked

        Thread.sleep(1000L);
        driver.findElement(By.id("checkBoxOption1")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());          // Print true if it's clicked, otherwise false
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());          // Check if it is unchecked
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());  // To get the number of checkboxes present on the page


    }
}
