package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AndersenHomePage {

    private WebDriver driver;

    @FindBy(xpath = "//button[contains(text(), 'discuss')]")
    private WebElement discussButton;

    @FindBy(xpath = "//button[contains(text(), 'Send request')]")
    private WebElement sendRequestButton;

    public AndersenHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public boolean isDiscussButtonVisible() {
        return discussButton.isDisplayed();
    }

    public boolean isSendRequestButtonVisible() {
        return sendRequestButton.isDisplayed();
    }
}
