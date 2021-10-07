package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_amazonArama {
    public static void main(String[] args) {
        //amazon sayfasina girip java icin arama yapin
        //ve bulunan sonuc sayfasini yazdirin
        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        // autocomplete="off" placeholder=""
        // class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        // aria-label="Search">
        //1.yontem
        WebElement arama= driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("Java"+ Keys.ENTER);
        //<input id="nav-search-submit-button" type="submit"
        // class="nav-input nav-progressive-attribute" value="Go" tabindex="0">
        //2. Yöntem
        //WebElement aramabutonu= driver.findElement(By.id("nav-search-submit-button"));
        //aramabutonu.click();
        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());
        //web elemntler obje oldugu icin direk yazdirilamazlar
        //web elementin sahip oldugu yaziyi String olarak yazdirmak icin
        //getText() method u kullanilir

    }
}
