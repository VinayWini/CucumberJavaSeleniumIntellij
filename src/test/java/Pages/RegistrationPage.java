package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistrationPage extends BrowserDriver
{
    public static String NewRgPath="//h1[normalize-space()='User Registration Page']";

    public static void VisibilityNewRgPage() throws InterruptedException {
        Thread.sleep(2000);
        String ActualT =driver.findElement(By.xpath(NewRgPath)).getText();
        System.out.println(ActualT);
        assertEquals(ActualT,"User Registration Page");
        //assertTrue(ActualF.contains("User Registration Page"));
    }

}
