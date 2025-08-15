package serenityswag.authentication.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class LoginActions extends UIInteractionSteps {

    @Step("Log in as a {0}}")
    public void as(Users user) {
        openUrl("https://www.saucedemo.com");
        $("[data-test='username']").sendKeys(user.getUsername());
        $("[data-test='password']").sendKeys(user.getPassword());
        $("[data-test='login-button']").click();
    }

    @Step("Log in as a locked out user")
    public void asALockedOutUser() {
        openUrl("https://www.saucedemo.com");
        $("[data-test='username']").sendKeys("locked_out_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
    }

    @Step("Log in as a problem user user")
    public void asAProblemUser() {
        openUrl("https://www.saucedemo.com");
        $("[data-test='username']").sendKeys("problem_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
    }

    @Step("Log in as a performance glitch user")
    public void asAPerformanceGlitchUser() {
        openUrl("https://www.saucedemo.com");
        $("[data-test='username']").sendKeys("performance_glitch_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
    }

    @Step("Log in as a error user")
    public void asAErrorUser() {
        openUrl("https://www.saucedemo.com");
        $("[data-test='username']").sendKeys("error_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
    }

    @Step("Log in as a visual user")
    public void asAVisualUser() {
        openUrl("https://www.saucedemo.com");
        $("[data-test='username']").sendKeys("visual_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();
    }
}
