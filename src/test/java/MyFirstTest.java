import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    }
}
