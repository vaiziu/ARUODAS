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
    _globalDriver= new ChromeDriver();
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
        WebElement flats = _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[1]/li[1]/ul/li[1]"));
        flats.click();
        WebElement forBuying= _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[2]/li[1]"));
        forBuying.click();
        WebElement district =_globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div/ul[3]/li[1]/a[1]"));
        district.click();


























}
