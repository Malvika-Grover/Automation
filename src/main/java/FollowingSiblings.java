import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSiblings {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.scientecheasy.com/2019/08/xpath-axes.html/");
//        driver.findElement(By.xpath("//a[@class='read-more']")).click();
        driver.findElement(By.xpath("//div[@class='lwptoc_item'][4]/preceding-sibling::div[2]")).click();
//        driver.findElement(By.xpath("//div[@class='lwptoc_item'][4]/following-sibling::div[3]")).click();
    }
}


/*

4->2  //div[@class='lwptoc_item'][4]/preceding-sibling::div[2]
4->6  //div[@class='lwptoc_item'][4]/following-sibling::div[2]

 */


