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
            driver.get("https://diary.ru/user/registration");


            WebElement loginField = driver.findElement(By.xpath("//input[@id='signupform-username']"));
            loginField.sendKeys("lisaShymkovich");

            WebElement passwordField = driver.findElement(By.xpath("//input[@id='signupform-password']"));
            passwordField.sendKeys("lisa12345678");

            WebElement emailField = driver.findElement(By.xpath("//input[@id='signupform-email']"));
            emailField.sendKeys("lisa3973617@gmail.com");

            WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
            checkBox.click();

            WebElement signUpButton = driver.findElement(By.xpath("//button[@id='signup_btn']"));
            signUpButton.click();
        } finally {
            driver.quit();
        }
    }
}