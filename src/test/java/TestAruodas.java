import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAruodas {
    WebDriver _globalDriver;

    @BeforeTest
    public void setUp() {
        _globalDriver = new ChromeDriver();
        _globalDriver.get("https://m.aruodas.lt/");
    }

    @AfterTest
    public void setUp2(){
    _globalDriver.close();
    }


    @Test
    public void testingBuyFlat() {
        _globalDriver.get("https://m.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton=_globalDriver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/div[2]/div/button[1]"));
        cookieButton.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement flats = _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[1]/li[1]/ul/li[1]"));
        flats.click();
        WebElement forBuy= _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[2]/li[1]"));
        forBuy.click();
        WebElement city = _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[3]/li[1]/a[1]"));
        city.click();// ????
        WebElement choosingCity= _globalDriver.findElement(By.xpath("/html/body/div/ul[1]/li[2]/a"));
        choosingCity.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement district = _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[3]/li[2]/a"));
        district.click();
        WebElement chooseDistrict= _globalDriver.findElement(By.xpath("/html/body/div/ul/li[2]/label/span[1]"));
        chooseDistrict.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.id("submitSelect1")).click(); // issaugoti pasirinkima
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement rooms= _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[3]/li[4]/a"));
        rooms.click();
        WebElement chooseRoomsMin= _globalDriver.findElement(By.xpath("/html/body/div/ul[1]/li[2]/label/span"));
        chooseRoomsMin.click();
        WebElement chooseRoomsMax= _globalDriver.findElement(By.xpath("/html/body/div/ul[2]/li[2]/label/span"));
        chooseRoomsMax.click();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement search= _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[3]/li[10]/a[2]"));
        search.click();

    }



}
