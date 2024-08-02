package StepDefinition;

import io.cucumber.java.en.Then;

import static Pages.RegistrationPage.VisibilityNewRgPage;

public class RegistrationPage
{
    @Then("User should be able to view the New registration page")
    public void user_should_be_able_to_view_the_new_registration_page() throws InterruptedException
    {
        VisibilityNewRgPage();
    }
}
