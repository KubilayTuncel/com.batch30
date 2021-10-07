package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {
        //Yeni bir Class olusturalim. (VerifyTitle)
        //Amazon ana sayfasina gidelim . https://www.amazon.com/
        //Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)

        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("title beklenen degerile ayni, test PASS");
        }else{
            System.out.println("title beklenmeden farkli, test Failed");
            System.out.println("aktuel title :"+driver.getTitle());
        }
        driver.close();
    }
}
