import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");

//        Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());

        driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());
        Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).isSelected());


    }
}
