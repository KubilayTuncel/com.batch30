package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // Youtube ana sayfasina gidelim https://www.techproeducation.com/
        //Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin

        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com/");
        String expextedUrl="www.techproeducation.com";
        String actualUrl= driver.getCurrentUrl();
        if (expextedUrl.equals(actualUrl)) {
            System.out.println("Url ayni, test PASS");
        }else{
            System.out.println("Url farkli, test failed");
            System.out.println("dogru Url : "+driver.getCurrentUrl());
        }
        driver.close();
    }
}
