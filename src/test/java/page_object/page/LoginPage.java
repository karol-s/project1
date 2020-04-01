package page_object.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginAs (String login, String password) {
        WebElement emailInputField = driver.findElement(By.name("email"));
        emailInputField.click();
        emailInputField.sendKeys(login);

        WebElement passwordInputField = driver.findElement(By.name("password"));
        passwordInputField.click();
        passwordInputField.sendKeys(password);

        driver.findElement(By.id("submit-login")).click();
    }
}
