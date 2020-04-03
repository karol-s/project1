package page_object.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.page.HummingbirdPrintedTshirtPage;
import page_object.page.LoginPage;
import page_object.page.MainPage;
import page_object.page.YourAccountPage;

import java.util.concurrent.TimeUnit;

public class BuyProductTest {

    private WebDriver driver;

    @Given("User is logged in to CodersLab shop")
    public void userIsLoggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAs("miwpxrvovnltjbkojq@ttirv.net", "password123");
    }

    @When("User goes to main page")
    public void userGoesToMainPage() {
        new YourAccountPage(driver).clickLogoButton();
    }

    @And("User chooses (.*) from products")
    public void userChoosesOneProductFromProducts(String wantedProduct) {
        new MainPage(driver).chooseWantedProduct(wantedProduct);
    }

    @And("Check discount is equals to (.*)")
    public void checkDiscountIsEqualsToHowManyProcent(String discount) {
        new HummingbirdPrintedTshirtPage(driver).checkDiscount(discount);
    }

    @And("User chooses (.*) size")
    public void userChoosesMSize(String size) {
        new HummingbirdPrintedTshirtPage(driver).selectSize(size);
    }

    @And("User chooses (.*) pieces")
    public void userChoosesHowManyPieces(String pieces) {
        new HummingbirdPrintedTshirtPage(driver).selectQuantity(pieces);
    }

    @And("User clicks submit")
    public void userClicksSubmit() {
        new HummingbirdPrintedTshirtPage(driver).clickSubmitButton();
    }
}
