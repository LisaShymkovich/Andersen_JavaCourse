import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AndersenHomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestButtonPresence {

    private WebDriver driver;
    private AndersenHomePage homePage;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://andersenlab.com/");
        homePage = new AndersenHomePage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testDiscussButtonsVisible() {
        assertTrue(homePage.isDiscussButtonVisible(), "Кнопка 'Let's discuss your project' должна отображаться на странице");
    }

    @Test
    public void testsendRequestButtonVisible() {
        assertTrue(homePage.isSendRequestButtonVisible(), "Кнопка 'Send Requet' должна отображаться на странице");
    }
}
