import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogInScenarioTest {

    @Test
    public void testLogInScenario() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.bbc.com");

            WebElement signInButton = driver.findElement(By.xpath("//button[@aria-label='Sign In']"));
            signInButton.click();

            WebElement emailField = driver.findElement(By.xpath("//input[@id='username']"));
            emailField.sendKeys("lisa3973617@gmail.com");

            WebElement continueButton = driver.findElement(By.xpath("//button[@id='submit-button']"));
            signInButton.click();
        } finally {
            driver.quit();
        }
    }
}
