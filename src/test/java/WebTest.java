import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test
            public void testFirst() throws InterruptedException { //всегда начинаем со слова тест

        String driverPath = "C:\\Users\\golov\\chromedriver.exe"; // чтобы не прописывать снова
        String chromeDriver = "webdriver.chrome.driver";
        String url =  "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";


        System.setProperty(chromeDriver, driverPath);
        WebDriver driver = new ChromeDriver(); //обе эти команды отвечают за open browser

        driver.get(url);

        Thread.sleep(3000); //задержит чтобы мы могли увидеть


        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult,expectedResult);

        driver.close(); //закроет окно
        driver.quit(); // уйдет из драйвера

    }




}
