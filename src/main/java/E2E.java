import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Redirect to this URL
        driver.get("https://www.spicejet.com/");

        //One-way trip
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        // Select checkbox
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
        // From - dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        // From - select elements
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(1000L);

        // To - select elements
        driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
        Thread.sleep(1000L);

        // Select current date
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();
        // Passengers
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000L);

        // Adults
        driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")).click();
        // Number of Adults
        driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']/option[@value='4']")).click();
        Thread.sleep(1000L);

        // Currency dropdown
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        // Select USD
        driver.findElement(By.xpath("//option[@value='USD']")).click();
        Thread.sleep(1000L);

        // Search
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        Thread.sleep(2000L);

        // Checkbox- Terms and Conditions
        driver.findElement(By.xpath("//input[@id='ControlGroupSelectView_AvailabilityInputSelectView_FamilyAndFriendsAgreement']")).click();
        // Next day button
        driver.findElement(By.xpath("//a[@class='buttonN btn-small']")).click();
        Thread.sleep(2000L);

        // Checkbox- Terms and Conditions
        driver.findElement(By.xpath("//input[@id='ControlGroupSelectView_AvailabilityInputSelectView_FamilyAndFriendsAgreement']")).click();
        // Currency convertor button
        driver.findElement(By.xpath("//div[@class='curency_convert_select']/a")).click();
        Thread.sleep(1000L);

        // Convert:
        driver.findElement(By.xpath("//select[@id='CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency']")).click();
        Thread.sleep(1000L);

        // Select currency
        driver.findElement(By.xpath("//select[@id='CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency']/option[@value='USD']")).click();
        // Into:
        driver.findElement(By.xpath("//select[@id='CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency']")).click();
        Thread.sleep(1000L);

        // Select currency
        driver.findElement(By.xpath("//select[@id='CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency']/option[@value='INR']")).click();
        // Enter amount that is to be converted
        driver.findElement(By.xpath("//input[@id='CurrencyConverterCurrencyConverterView_TextBoxAmount']")).sendKeys("99.9");
        // Click Convert
        driver.findElement(By.xpath("//input[@value='Convert']")).click();
        Thread.sleep(1000L);

        // Click Close
        driver.findElement(By.xpath("//input[@value='Close']")).click();
    }

}
