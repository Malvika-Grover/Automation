import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingCart {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        //Adding 1 Broccoli to the Cart
        driver.findElement(By.xpath("//div[@class='products']/div[1]/div[3]/button")).click();

        Thread.sleep(1000L);

        //Adding 2 Cauliflower to the Cart
        for (int i=0; i<1 ; i++) {
            driver.findElement(By.xpath("//div[@class='products']/div[2]/div[2]/a[@class='increment']")).click();
        }
        driver.findElement(By.xpath("//div[@class='products']/div[2]/div[3]/button")).click();

        Thread.sleep(1000L);

        //Adding 3 Cucumber to the Cart
        for (int i=0; i<2; i++){
            driver.findElement(By.xpath("//div[@class='products']/div[3]/div[2]/a[@class='increment']")).click();
        }
        driver.findElement(By.xpath("//div[@class='products']/div[3]/div[3]/button")).click();

        Thread.sleep(1000L);

        //Adding 4 Beetroot to the Cart
        for (int i=0; i<=2; i++){
            driver.findElement(By.xpath("//div[@class='products']/div[4]/div[2]/a[@class='increment']")).click();
        }
        driver.findElement(By.xpath("//div[@class='products']/div[4]/div[3]/button")).click();

        Thread.sleep(1000L);

        // Clicking on Cart icon
        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();

        Thread.sleep(1000L);
        // Checkout
        driver.findElement(By.xpath("//div[@class='cart-preview active']/div[2]/button")).click();

        Thread.sleep(2000l);
        //Promocode
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");

        Thread.sleep(4000L);
        // Apply
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        //Place order
        driver.findElement(By.xpath("//div[@class='products-wrapper']/div/div/button")).click();


        // Accept T&C
        driver.findElement(By.xpath("//div[@class='wrapperTwo']/input[@type='checkbox']")).click();

        // Choose Country
        driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select")).click();

        Thread.sleep(1000L);

        // Select India
        driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select/option[@value='India']")).click();

        Thread.sleep(1000L);
        // Proceed
        driver.findElement(By.xpath("//div[@class='wrapperTwo']/button")).click();
    }
}
