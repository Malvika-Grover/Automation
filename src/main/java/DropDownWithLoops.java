import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithLoops {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);
         int i = 1;

//         selecting drop down using while loop
//        while (i<5){
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
//        driver.findElement(By.id("btnclosepaxoption")).click();
//        selecting drop down using for loop
        for (i=1;i<=5;i++){
            Thread.sleep(1000L);
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

    }
}
