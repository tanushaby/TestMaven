package uitests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CorrectInputDataLoginAndPasswordAndCode {
    public WebDriver driver;

    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Egor\\Downloads\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }


    /*
1. Зайти на страницу https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=
https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2
Fprefetch&force_new_session=true; - OP:  Открывается страница авторизации.
2. Заполнить поле для ввода логина и пороля валидными данными, нажать кнопку Войти; - ОР: Осуществляется переход
на следующую страницу для ввода кода
3. Заполнить поле для ввода кода из СМС валидным значением. ОР: Осуществляется переход на главную страницу сайта
*/
    @Test
    public void correctInputDataLoginAndPasswordAndCode() {
        driver.navigate().to("https://idemo.bspb.ru/auth?response_type=code&client_id=1&" +
                "redirect_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fsuccess&prefetch" +
                "_uri=https%3A%2F%2Fidemo.bspb.ru%2Flogin%2Fprefetch&force_new_session=true");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Интернет банк - Банк Санкт-Петербург"));

        WebElement inputLogin = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/input"));
        inputLogin.clear();
        inputLogin.sendKeys("demo");

        WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input"));
        inputPassword.clear();
        inputPassword.sendKeys("demo");

        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

        WebElement inputCode = driver.findElement(By.xpath("//*[@id=\"otp-code\"]"));
        inputCode.clear();
        inputCode.sendKeys("0000");

        driver.findElement(By.xpath("//*[@id=\"login-otp-button\"]")).click();

    }
}