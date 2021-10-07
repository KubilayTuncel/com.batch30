package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException{
       //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email"
        // data-testid="royal_email" placeholder="Email address or phone number"
        // autofocus="1" aria-label="Email address or phone number">
        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //email teyt box a ali yazdiralim
        WebElement mailTextBox = driver.findElement(By.id("email"));
        mailTextBox.sendKeys("aliseleniumcu@gmail.com");
        Thread.sleep(2000);
        mailTextBox.clear();
        WebElement mailBoxByTagName= driver.findElement(By.tagName("input"));
       // mailBoxByTagName.sendKeys("veliGocer@gmail.com");
       // WebElement falseElement= driver.findElement(By.id("emailfalse"));
       // falseElement.sendKeys("false element"); give NoSuchElement Excep.

        //giris yap butonuna tiklayalim
        WebElement girisButonu= driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
        girisButonu.click();


    }
}
