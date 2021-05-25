import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class ShoppingCartAdvanced {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        //Initialize a variable as 0 to make sure our loop doesn't go more than needed
        int j = 0;

        //List of items needed to be added in the cart
        String[] itemNeeded = {"Cucumber", "Beetroot"};

        //List of all the products on the page - 30 elements
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        //To iterate over all the products (Loop will go from 0-30)
        for (int i=0; i<products.size(); i++){

            //Methods to get the formatted string without '-' and spaces
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();

            //Converting Array into Array for better execution (at run-time)
            List itemNeededList = Arrays.asList(itemNeeded);

            //If items needed matched the formatted name of items
            if (itemNeededList.contains(formattedName)){

                j++;

                //click on Add to Cart
                driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
                //To exit the loop exactly after 2 iterations as we have only 2 items in the list

                //This is to fetch the length of the item needed and stop the loop when it reaches/
                if (j == itemNeeded.length){
                    break;
                }
            }
        }
    }
}

/*
STEPS:

1. Make a String Array of desired products  -  itemNeeded
2. Make a list of all the products on the screen  -  products
3. Iterate through all the products and find whether the desired item is there on the screen or not
4. If it is present - click Add to Cart
5. If not come out of the loop

 */

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.Arrays;
//import java.util.List;
//
//public class ShoppingCartAdvanced {
//
//    public static void main(String[] args) {
//
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//
//        int j=0;
//
//        String[] desiredItem = {"Cucumber", "Cauliflower"};
//
//        List <WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
//
//        for (int i=0; i<products.size(); i++){
//
//            String[] productName = products.get(i).getText().split("-");
//            String formattedName = productName[0].trim();
//
//            List productsNeeded = Arrays.asList(desiredItem);
//
//            if (productsNeeded.contains(formattedName)){
//                j++;
//
//                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//
//                if (j==2){
//                    break;
//                }
//
//            }
//        }
//    }
//}





















