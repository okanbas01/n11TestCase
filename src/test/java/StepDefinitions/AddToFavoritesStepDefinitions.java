package StepDefinitions;

import Pages.n11Pages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AddToFavoritesStepDefinitions {
    WebDriver driver = DriverFactory.getDriver();
    n11Pages n11Pages = new n11Pages(driver);
    @Given("A user opens the website")
    public void aUserOpensTheWebsite() {
        Pages.n11Pages.HomePage();

    }

    @Then("A user opens the login page,")
    public void aUserOpensTheLoginPage() {
        Pages.n11Pages.OpenLoginPage();
    }

    @When("User enter email and password")
    public void userEnterEmailAndPassword() {
        Pages.n11Pages.EnterEmailAndPassword();

    }

    @When("User search samsung to search input field")
    public void userSearchSamsungToSearchInputField() {
        Pages.n11Pages.Search();

    }

    @Then("User should see samsung in search result")
    public void userShouldSeeSamsungInSearchResult() {
        Pages.n11Pages.SearchResult();

    }

    @When("User click second page")
    public void userClickSecondPage() {
        Pages.n11Pages.ClickSecondPage();

    }

    @Then("User checks it exists on the second page")
    public void userChecksItExistsOnTheSecondPage() {
        Pages.n11Pages.CheckSecondPage();
    }

    @When("User add the third product to user's favorites")
    public void userAddTheThirdProductToUserSFavorites() {
        Pages.n11Pages.addFavorites();
    }

    @When("User click my favorites")
    public void userClickMyFavorites() {
        Pages.n11Pages.ClickMyFavorites();

    }

    @Then("User checks that the product has been added to favorites")
    public void userChecksThatTheProductHasBeenAddedToFavorites() {
        Pages.n11Pages.CheckFavorites();

    }

    @When("User click the remove from favorites button")
    public void userClickTheRemoveFromFavoritesButton() {
        Pages.n11Pages.RemoveFavorites();
    }

    @Then("User checks that the product has been removed to favorites")
    public void userChecksThatTheProductHasBeenRemovedToFavorites() {
        Pages.n11Pages.CheckRemoveFavorites();
    }
}
