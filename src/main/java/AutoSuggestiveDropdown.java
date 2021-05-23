import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestiveDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(500);

        List<WebElement> Options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option :Options){
            if(option.getText().equalsIgnoreCase("India")){
                option.click();
            }
        }
    }
}
