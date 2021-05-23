import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=eu");
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("MalvikaGrover");
        driver.findElement(By.id("password")).sendKeys("grovermalvika");
        driver.findElement(By.name("rememberUn")).click();
        driver.wait(20);
        driver.findElement(By.name("Login")).click();
        driver.findElement(By.id("error")).getText();

        driver.close();

    }
}
