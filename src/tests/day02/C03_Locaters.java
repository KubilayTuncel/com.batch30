package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class C03_Locaters {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. http://a.testaddressbook.com adresine gidiniz.
        // b. Sign in butonuna basin
        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.

        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com");
        //<a id="sign-in" class="nav-item nav-link"
        // data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement girisButonu= driver.findElement(By.id("sign-in"));
        girisButonu.click();
        Thread.sleep(2000);
        //<input type="email" class="form-control" placeholder="Email"
        // data-test="email" name="session[email]" id="session_email">
        WebElement emailYaz = driver.findElement(By.id("session_email"));
        emailYaz.sendKeys("testtechproed@gmail.com");
        //<input class="form-control" placeholder="Password" data-test="password"
        // type="password" name="session[password]" id="session_password">
        WebElement passwordYaz= driver.findElement(By.id("session_password"));
        passwordYaz.sendKeys("Test1234!");
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary"
        // data-test="submit" data-disable-with="Sign in">
        WebElement kayitButonu= driver.findElement(By.name("commit"));
        kayitButonu.click();
        //<span class="navbar-text"
        // data-test="current-user">testtechproed@gmail.com</span>
        WebElement dogruKullanici= driver.findElement(By.className("navbar-text"));
        String username="testtechproed@gmail.com";
        if (dogruKullanici.getText().equals(username)) {
            System.out.println("dogru kullanici testi PASS");
        }else{
            System.out.println("dogru kullanici Failed");
        }
        //<a class="nav-item nav-link"
        // data-test="addresses" href="/addresses">Addresses</a>
        WebElement adresLinki= driver.findElement(By.linkText("Addresses"));
        WebElement sigoutLinki= driver.findElement(By.linkText("Sign out"));
        if (adresLinki.isDisplayed()){
            System.out.println("Adresses linki gorunuyor, test Pass");
        }else{
            System.out.println("Adreses linki gorunmuyor, test Failed");
        }
        if (sigoutLinki.isDisplayed()){
            System.out.println("Sign out linki gorunuyor, test Pass");
        }else{
            System.out.println("Sign out linki gorunmuyor, test Failed");
        }

        List<WebElement> Linkler = driver.findElements(By.tagName("a"));

        System.out.println(Linkler.size());
        Linkler.stream().forEach((x)-> System.out.println(x.getText()));
        driver.close();

    }
}
