package serenityswag.authentication;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOn extends UIInteractionSteps {

//    @Managed
//    WebDriver driver;

    @Test
    public void usersCanLogOnViaTheHomePage() {

        openUrl("https://www.saucedemo.com");
        $("[data-test='username']").sendKeys("standard_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();

        // Should see product catalog
        assertThat($(".title").getText())
                .isEqualToIgnoringCase("Products");
    }
}
