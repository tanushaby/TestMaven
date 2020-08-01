package uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FirstSeleniumTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Egor\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver.get("https://google.com");

        driver.manage().window().maximize();

        driver.get("https://music.yandex.by");
        driver.findElement(By.className("button__label")).click();

        //driver.findElement(By.name("q")).sendKeys("Шаг" + Keys.ENTER);
       // driver.findElement(By.xpath("//*[@id=\"tads\"]/div/ol/li/div[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"menu-item-4336\"]/a")).click();


        driver.quit();
    }
}
