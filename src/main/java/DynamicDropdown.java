import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='KQH']")).click();
        System.out.println(driver.findElement(By.xpath("//a[@value='KQH']")).getText());
        Thread.sleep(1000);
//      driver.findElement(By.xpath("(//a[@value='PAT'])[2]")).click();     --> 1
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PAT']")).click();       // --> 2
        System.out.println(driver.findElement(By.xpath("//div[@class='search_options_menucontent']//a[@value='PAT']")).getText());


        WebElement drop = driver.findElement(By.id("cyx"));
        Select dropdown = new Select(drop);
        System.out.println(dropdown.getFirstSelectedOption().getText());



    }
}


/*

There are 2 ways to fetch dynamic dropdowns:
1. When you have to 1 xpath of 2 elements on 2 different dropdown then selenium get confuses which one to select.
By default it selects the first one and throws error for the second saying "element not visible",
to avoid the error simply provide indexes.

2. For good coding practise, it is an alternative to the above problem statement.
Approach- Parent-Child relationship
fetch the parent of that particular dropdowns window and navigate till the xpath and simply click it.

Note: Remember, you have to give one space between parent-child
eg: //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='PAT']
    -------------------parent--------------------------------one_space----child-------

 */