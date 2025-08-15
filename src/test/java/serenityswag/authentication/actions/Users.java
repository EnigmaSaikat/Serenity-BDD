package serenityswag.authentication.actions;


/*
 *
 * standard_user
 * locked_out_user
 * problem_user
 * performance_glitch_user
 * error_user
 * visual_user
 *
 */

public enum Users {

    STANDARD_USER("standard_user", "secret_sauce", "A user with standard access"),
    LOCKED_OUT_USER("locked_out_user", "secret_sauce", "A user who is locked out of the system"),
    PROBLEM_USER("problem_user", "secret_sauce", "A user with a problem in his/her account"),
    PERFORMANCE_GLITCH_USER("performance_glitch_user", "secret_sauce", "A user with performance issues"),
    ERROR_USER("error_user", "secret_sauce", "A user with an error in his/her account"),
    VISUAL_USER("visual_user", "secret_sauce", "A user with visual issues");

    private final String username;
    private final String password;
    private final String description;

    Users(String username, String password, String description) {
        this.username = username;
        this.password = password;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return description;
    }
}
