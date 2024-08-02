package StepDefinition;


import io.cucumber.java.en.When;
import static Pages.LoginPage.*;

public class LoginPage
{
    @When("User successfully enters the login details")
    public void user_successfully_enters_the_login_details() throws InterruptedException
    {
        SendUserName();
        SendPassKey();
        ClickLoginKey();
    }
    @When("User clicks on new registration button")
    public void user_clicks_on_new_registration_button() throws InterruptedException
    {
        ClickOnNewUsr();

    }
}
