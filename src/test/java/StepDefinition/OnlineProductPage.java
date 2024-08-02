package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.OnlineProductPage.CheckFormalShoeDropdownTable;
import static Pages.OnlineProductPage.ClickShoeDropdown;
import static Pages.RegistrationPage.VisibilityNewRgPage;
import static org.junit.Assert.assertEquals;

public class OnlineProductPage
{
    @When("User clicks on formal shoes dropdown")
    public void user_clicks_on_formal_shoes_dropdown() throws InterruptedException
    {
        ClickShoeDropdown();
    }
    @Then("User should be able to view the Product")
    public void user_should_be_able_to_view_the_Product() throws InterruptedException
    {
        CheckFormalShoeDropdownTable();

    }
}
