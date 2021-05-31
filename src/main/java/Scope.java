import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        // To find the link on the whole webpage
        System.out.println(driver.findElements(By.tagName("a")).size());

        // Making a webElement "footerelement" to limit the scope
        WebElement footerElements = driver.findElement(By.id("gf-BIG"));

        // Getting the count of the footer links
        System.out.println(footerElements.findElements(By.tagName("a")).size());

        // To find the links on a specific column on the web page under footer
        WebElement footerSubElements = footerElements.findElement(By.xpath("//table/tbody/tr/td[1]/ul[1]"));
        System.out.println(footerSubElements.findElements(By.tagName("a")).size());

        // Click on each link and check if they are working or not
        for (int i=1; i<footerSubElements.findElements(By.tagName("a")).size() ;i++){

            // Make a String variable having all the keyboard shortcuts
            String clickOnTab = Keys.chord(Keys.CONTROL,Keys.ENTER);

            // Pass the keyboard shortcuts while clicking on links one by one
            footerSubElements.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
            Thread.sleep(5000L);
        }

        // Made a set data type variable having windowshandles
        Set<String> abc = driver.getWindowHandles();
        // Iterating over windows using iterator
        Iterator<String> it = abc.iterator();

        // While loop will continue working until there is no window in the end
        while (it.hasNext()){

            // To shift from one window to the next
            driver.switchTo().window(it.next());

            // Printing out the titles
            System.out.println(driver.getTitle());
        }

    }

}
