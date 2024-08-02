package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static Pages.LoggedInPage.*;
import static Pages.LoginPage.*;

public class LoggedInPage
{
    @Then("User should be able to product category page")
    public void User_should_be_able_to_product_category_page() throws InterruptedException
    {
        CheckFormalShoe();
        CheckSportsShoe();
        CheckSneakerShoe();
    }
}
