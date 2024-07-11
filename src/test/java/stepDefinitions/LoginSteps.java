package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("User is on the login page");
        // Burada login sayfasına gitme veya ön koşulları gerçekleştirme işlemleri yapılır
    }

    @When("I enter my username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        System.out.println("Username entered: " + username);
        System.out.println("Password entered: " + password);
        // Kullanıcı adı ve şifre alanlarına değerleri girme işlemi yapılır
    }

    @When("I click the login button")
    public void i_click_login_button() {
        System.out.println("Clicked on the login button");
        // Login butonuna tıklama işlemi yapılır
    }

    @Then("I should be logged into my account")
    public void i_should_be_logged_in() {
        System.out.println("Successfully logged into the account");
        // Oturumun başarıyla açıldığını doğrulama işlemi yapılır
    }

    @Then("I should see an error message")
    public void i_should_see_error_message() {
        System.out.println("Error message: Invalid username or password");
        // Hata mesajının görüntülendiğini doğrulama işlemi yapılır
    }
}
