package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("su an daki url : "+driver.getCurrentUrl());
        System.out.println("su anki baslik : "+driver.getTitle());
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close(); //close sadece en son acilani (bir) browser kapatir.
        driver.quit(); //quit acik olan tum browser lari kapatirken

    }
}