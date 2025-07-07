package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver;

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        driver.findElement(By.id("loggin-button")).click();
    }

    @Given("I am on the SaucaDemo login page")
    public void iAmOnTheSaucaDemoLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @And("I enter paswword {string}")
    public void iEnterPaswword(String password) {
            driver.findElement(By.id("password")).sendKeys(password);
    }

    @Then("I should be redirected to the inventory page")
    public void iShouldBeRedirectedToTheInventoryPage() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("investory.html"));
        driver.quit();
    }
}
