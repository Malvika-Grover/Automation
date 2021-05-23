import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
//
public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("www.google.com");

}

    int a = 3;
    int b = 5;

    //method1
    public void sum(){
        int c = a+b;
        System.out.println("The Sum is "+c);
    }

    //method2
    public void multiply(){
        int c = a*b;
        System.out.println("The Multiply is "+c);
    }

    //method5
    public void Samsung(){
        System.out.println("This is a Samsung phone");
    }

    //method6
    public void Apple(){
        System.out.println("This is a Apple phone");
    }
}
