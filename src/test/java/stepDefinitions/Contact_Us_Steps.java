package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Base_PO;
import pageObject.Contact_Us_PO;

public class Contact_Us_Steps extends Base_PO {

private Contact_Us_PO contact_us_po;

public Contact_Us_Steps(Contact_Us_PO contact_us_po){
    this.contact_us_po = contact_us_po;
}

    public Contact_Us_Steps()  {
    }


    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contact_us_po.navigateToWebDriverUniversity_Contact_Us_Page();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
    //driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("AutoFN" + generateRandomNumber(5));
    contact_us_po.setUnique_FirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
      //driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("AutoLN" + generateRandomNumber(5));
        contact_us_po.setUnique_LastName();
}

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        //driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='email']")).sendKeys(generateRandomNumber(12) + "@gmail.com");
        contact_us_po.setUnique_EmailAddress();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        //driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(generateRandomString(25));
        contact_us_po.setUnique_Comment();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name_joe(String firstName) {
      //  driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstName);
    contact_us_po.setSpecific_FirstName((firstName));
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name_blogs(String lastName) {
        //driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastName);
    contact_us_po.setSpecific_LastName(lastName);
    }
    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address_joe_blog_test_com(String email) {
       // driver.findElement(By.xpath("//form[@id='contact_form']/input[@name='email']")).sendKeys(email);
        contact_us_po.setSpecific_EmailAddress(email);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        //driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys(comment);
        contact_us_po.setSpecific_Comment(comment);
    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() {
       // driver.findElement(By.xpath("//div[@id='form_buttons']/input[@value='SUBMIT']")).click();
        contact_us_po.clickOn_Submit_Button();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        //WebElement contactUs_submissionMessage = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        //Assert.assertEquals(contactUs_submissionMessage.getText(),"Thank You for your Message!");
        contact_us_po.validate_Successful_SubmissionMessage_Text();
    }

}
