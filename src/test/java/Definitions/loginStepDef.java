package Definitions;

import io.cucumber.java.en.*;

public class loginStepDef {

    @Given("^user login to the application$")
    public void user_login_to_the_application()  {
        System.out.println("Hello World..!" );
    }

    @When("^user input the user name and password$")
    public void user_input_the_user_name_and_password() {

    }

    @Then("^user should login to Dashboard$")
    public void user_should_login_to_dashboard() {

    }

    @And("^user clicks the login button$")
    public void user_clicks_the_login_button() {

    }


}
