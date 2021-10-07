package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {
    public static void main(String[] args) {
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        // b. Locate email textbox
        // c. Locate password textbox ve
        // d. Locate signin button
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement emailTextbox= driver.findElement(By.cssSelector(".form-control"));
        emailTextbox.sendKeys("testtechproed@gmail.com");
        WebElement password= driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        //WebElement password1= driver.findElement(By.cssSelector("#session_password"));
        //WebElement password2= driver.findElement(By.cssSelector("input[id='session_password']"));

        password.sendKeys("Test1234!");
        WebElement signIn= driver.findElement(By.xpath("//input[@type='submit']"));
        //WebElement signIn1= driver.findElement(By.cssSelector("input[type='submit']"));
        signIn.click();

    }
}
