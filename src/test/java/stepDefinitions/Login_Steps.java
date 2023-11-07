package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.Login_PO;
import java.io.IOException;

public class Login_Steps extends Base_PO {

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
                login_po.navigateTo_WebDriverUniversity_Login_Page();
    }

    @When("I enter a username {}")
    public void i_enter_a_username(String username){
        //driver.findElement(By.id("text")).sendKeys(username);
        login_po.setUsername(username);
    }

    @And("I enter a password {}")
    public void i_enter_a_password_webdriver123(String password) {
        //driver.findElement(By.id("password")).sendKeys(password);
        login_po.setPassword(password);
    }
    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        //driver.findElement(By.id("login-button")).click();
        login_po.clickOn_Login_Button();
    }

    @Then("I should be presented with the successful login message")
    public void i_should_be_presented_with_the_successful_login_message() {
        //String login_Message = driver.switchTo().alert().getText();
        //Assert.assertEquals(login_Message, "validation succeeded");
        login_po.validateSuccessfulLogin_Message();
    }

    @Then("I should be presented with the unsuccessful login message")
    public void i_should_be_presented_with_the_unsuccessful_login_message() {
        //String login_Message = driver.switchTo().alert().getText();
        //Assert.assertEquals(login_Message, "validation failed");
        login_po.validateUnsuccessfulLogin_Message();
    }


    @Then("I should be presented with the following login validation message {}")
    public void i_should_be_presented_with_the_following_login_validation_message(String expectedMessage) {
        //String login_Message = driver.switchTo().alert().getText();
        //Assert.assertEquals(login_Message, expectedMessage);
        waitForAlert_And_ValidateText(expectedMessage);

    }


}
