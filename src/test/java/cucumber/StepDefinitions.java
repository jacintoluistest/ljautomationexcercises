package cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import cucumber.CucumberTestRunner;
public class StepDefinitions {
    class RegisterUser{
        static String isUserRegistered(){
            return "yes";
        }
    }
    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I fill in the registration form with valid information")
    public void i_fill_in_the_registration_form_with_valid_information() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be logged in as a registered user")
    public void i_should_be_logged_in_as_a_registered_user() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
