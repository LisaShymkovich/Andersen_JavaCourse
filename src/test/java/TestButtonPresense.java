import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestButtonPresense {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://andersenlab.com/");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testDiscussButtonsVisible() {
        WebElement skypeButton = driver.findElement(By.xpath("//button[contains(text(), 'discuss')]"));
        assertTrue(skypeButton.isDisplayed(), "Кнопка 'Let's discuss your project' должна отображаться на странице");
    }

    @Test
    public void testAboutUsSectionVisible() {

        WebElement aboutUsSection = driver.findElement(By.xpath("//footer//a[contains(@href, 'andersenlab.com/about-us')]"));
        assertTrue(aboutUsSection.isDisplayed(), "Секция 'О нас' должна отображаться на странице");

    }
}
