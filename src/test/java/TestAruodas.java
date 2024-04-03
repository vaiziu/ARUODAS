import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestAruodas {
        WebDriver _globalDriver;

        @BeforeTest
        public void setUp() {
            _globalDriver = new ChromeDriver();
            _globalDriver.get("https://m.aruodas.lt/");
        }

//        @AfterTest
//        public void setUp2(){
//        _globalDriver.close();
//        }

    public static String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};

        String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

        Random random = new Random();

        StringBuilder email = new StringBuilder();
        int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
        for (int i = 0; i < usernameLength; i++) {
            String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers
            char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
            email.append(randomChar);
        }

        email.append("@");

        String randomDomain = domains[random.nextInt(domains.length)];

        email.append(randomDomain);

        return email.toString();
    }

    @Test
    public void testingSearch() {
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

    @Test
    public void testingAnnouncement() {
        _globalDriver.get("https://www.aruodas.lt/");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[2]"));
        cookieButton.click();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement insertAnnouncemet= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/a"));
        insertAnnouncemet.click();

        WebElement chooseFlat= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[1]"));
        chooseFlat.click();

        WebElement forRent= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/ul/li[2]"));
        forRent.click();

        WebElement chooseRegion= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/input[2]"));
        chooseRegion.click();

        WebElement chooseCity= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[3]"));
        chooseCity.click();

        WebElement quartal= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/span[2]"));
        quartal.click();

        WebElement chooseQuartal= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[5]/span[1]/ul[3]/li[28]"));
        chooseQuartal.click();

        WebElement street= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/input[2]"));
        street.click();

        WebElement chooseStreet= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[3]/li[124]"));
        chooseStreet.click();

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[7]/span[1]/input")).sendKeys("1"); //namo nr

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[14]/span[2]/input")).sendKeys("35"); // buto plotas

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[15]/div/div[1]/div[2]")).click(); //kambariu skaicius
/// iki cia veikia
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[17]/div[1]/span[2]/span")).click(); //aukstai

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[17]/div[1]/span[2]/ul/li[1]")).click();// aukstas 1

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[17]/div[2]/span[1]/span")).click(); //

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[17]/div[2]/span[1]/ul/li[5]")).click(); // 5as aukstas

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[18]/div[1]/span[1]/span/input")).sendKeys("1964"); // statybos metai

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[19]/div/div[2]/div[2]")).click(); // pastato tipas

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[20]/div/div[1]/div[2]")).click(); //irengimas

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[22]/div/div[1]/label/span")).click();// centrinis

        WebElement description= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[37]/div/div[1]/textarea"));
        description.sendKeys("puiki lokacija, rami aplinka");

//        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[39]/div/div[1]/a")). click();//ikelti foto

//        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/form/div[1]/div[8]/div[7]/label/a/span[2]/input")).sendKeys("C:\\Users\\Kaspis\\Desktop\\picture.png");//įkelti nuotraukas NEIKELIA

        _globalDriver.findElement(By.id("priceField")).sendKeys("600");// kaina menesiui

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[47]/span[1]/input")).sendKeys("61200011");// telefono nr

        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[48]/span[1]/input")).sendKeys(generateRandomEmail());// email. skelbimo redagavimui

        _globalDriver.findElement(By.xpath(" /html/body/div[1]/div[2]/form/ul/li[51]/span[1]/div/div/label/span")).click();//sutikti su taisyklemis

        _globalDriver.findElement(By.id("submitFormButton")).click();

//        WebElement order= _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[9]/div/div/button"));
//        Assert.assertEquals(order.getText(), "UŽSAKYTI"); KAIP PATIKRINTI SU ASSERT




    }
















}
