import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
//        driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();          -> Xpath

        /*
        There are 2 ways of writing xpath, one using xpath and one using css selector
         */

//        driver.findElement(By.cssSelector("a[id='nav-logo-sprites'])")).click();      -> CSS Selector
//        driver.findElement(By.xpath("//a[@id='nav-global-location-popover-link']")).click();
//        driver.findElement(By.xpath("//span[@id='nav-search-label-id']"));
//        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
//        driver.findElement(By.xpath("//input[@value='Go']")).click();
//        driver.findElement(By.xpath("span[class='icp-nav-flag icp-nav-flag-in']")).click();
//        driver.findElement(By.xpath("a[id='nav-link-accountList']")).click();
//        driver.findElement(By.xpath("a[id='nav-orders']")).click();
//        driver.findElement(By.xpath("a[id='nav-cart']")).click();
        driver.wait(1);
        driver.close();

    }

}


/*
XPATH Practise:

amazon = //a[@id='nav-logo-sprites']
Deliver= //a[@id='nav-global-location-popover-link']
All = //span[@id='nav-search-label-id']
search_bar = //input[@id='twotabsearchtextbox']
search_button = //input[@value='Go']
India = span[class='icp-nav-flag icp-nav-flag-in']
Account_name = a[id='nav-link-accountList']
Return_and_orders = a[id='nav-orders']
cart = a[id='nav-cart']

 */