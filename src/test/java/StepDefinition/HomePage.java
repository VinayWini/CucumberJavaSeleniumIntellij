package StepDefinition;

import io.cucumber.java.en.Given;
import static Pages.HomePage.*;

public class HomePage
{


    @Given("User navigate to the login page")
    public void user_navigate_to_the_login_page() throws InterruptedException {
        ClickHam_Menu();
        Click_SignIn_Link();
    }
    @Given("User navigate to the online product page")
    public void user_navigate_to_the_online_product_page() throws InterruptedException {
        ClickHam_Menu();
        Click_OnlineProduct_Link();

    }

}
