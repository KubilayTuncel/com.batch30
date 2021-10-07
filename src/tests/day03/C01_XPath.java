package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    public static void main(String[] args) {
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        //2- Add Element butonuna basin
        //3- Delete butonu’nun gorunur oldugunu test edin
        //4- Delete tusuna basin
        //5- Delete butonunun gorunur olmadigini test edin

        System.setProperty("webdriver.chrome.driver","/Users/kerimmac/Desktop/selenium/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //<button onclick="addElement()">Add Element</button>
        // WebElement addButonu= driver.findElement(By.tagName("button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addButonu.click();
        WebElement deletebuton=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deletebuton.isDisplayed()){
            System.out.println("delete butonu testi PASS");
        }else{
            System.out.println("delete butonu testi FAILED");
        }
        deletebuton.click();
        //Eger butona bastigimizda HTML kodundaki satirda silinyorsa driver'in
        //o elemnte ulasmasi mumkun olmayacagindan varligini ya da yoklugunu
        //test etmemiz mumkun olmaz.
        //var olan bir element bu sekilde silindikten sonra locate etmeye calisirsak
        //StaleElementReferenceException aliriz

    }
}
