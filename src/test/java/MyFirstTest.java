import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class MyFirstTest {
    WebDriver driver;

    @BeforeTest public void setupTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test public void testFirst(){
        driver.get("https://ithillel.ua/");
        By btnFreeConsultationPath = By.id("btn-consultation-hero");
        WebElement btnFreeConsultation = driver.findElement(btnFreeConsultationPath);
        btnFreeConsultation.click();
        By fieldName = By.id("input-name-consultation");
        WebElement fieldNameA = driver.findElement(fieldName);
        fieldNameA.click();
        fieldNameA.sendKeys("Testing");
        By fieldEmail = By.id("input-email-consultation");
        WebElement fieldEmailA = driver.findElement(fieldEmail);
        fieldEmailA.click();
        fieldEmailA.sendKeys("test@gmail.com");
        By fieldTel = By.id("input-tel-consultation");
        WebElement fieldTelA = driver.findElement(fieldTel);
        fieldTelA.click();
        fieldTelA.sendKeys("1234567");
    }
    @AfterTest public void Quit(){
        driver.quit();
    }
}
