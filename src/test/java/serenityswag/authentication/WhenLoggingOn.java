package serenityswag.authentication;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOn{

    @Managed
    WebDriver driver;

    @Steps
    LoginActions loginActions;
    InventoryPage inventoryPage;

    @Test
    public void usersCanLogOnViaTheHomePage() {
        loginActions.as(Users.STANDARD_USER);

        Serenity.reportThat("The inventory page should be displayed with correct title",
                ()->assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products")
        );

    }
}
