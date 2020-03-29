package Postman_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {

    public void setUp() throws InterruptedException
    { System.setProperty("webdriver.chrome.driver","PostMan/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://identity.getpostman.com/login?addAccount=1");

        Thread.sleep(8000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("username")).sendKeys("funmi887@gmail.com");

        driver.findElement(By.id("password")).sendKeys("Fop4com8");
        driver.findElement(By.id("sign-in-btn")).click(); }

    public static void main(String[] args) throws InterruptedException {
        Login test = new Login();
        test.setUp();
    }
}
