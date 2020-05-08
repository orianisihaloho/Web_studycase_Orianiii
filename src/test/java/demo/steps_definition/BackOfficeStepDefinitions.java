package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @When("user input random item name on BackOffice Item Library")
  public void userInputRandomItemNameOnBackOfficeItemLibrary() {

    itemLibraryPage.inputItemName();
  }

  @When("User click create item button")
  public void userClickCreateItemButton() {

    itemLibraryPage.userClickCreateItemButton();
  }

  @When("User click categorized")
  public void userClickCategorized() {
    itemLibraryPage.userClickCategorized();
  }

  @When("user input price {string}")
  public void userInputPrice(String price) {
    itemLibraryPage.userInputPrice(price);

  }
  @When("User input SKU {string}")
  public void userInputSKU(String sku) {
    itemLibraryPage.userInputSKU(sku);
  }

  @When("User add variant")
  public void userAddVariant() {
    itemLibraryPage.userAddVariant();
  }

  @When("User choose modifier")
  public void userChooseModifier() {
  }

  @When("User click save")
  public void userClickSave() {
    itemLibraryPage.userClickSave();
  }


  @When("User input variant {string}")
  public void userInputVariant(String variant) {
    itemLibraryPage.userInputVariant(variant);
  }

  @When("User input variant price {string}")
  public void userInputVariantPrice(String variantprice) {
    itemLibraryPage.userInputVariantPrice(variantprice);
  }

  @When("User input variant sku {string}")
  public void userInputVariantSku(String variantsku) {
    itemLibraryPage.userInputVariantSku(variantsku);
  }

  @When("User clcik confirm")
  public void userClcikConfirm() {
    itemLibraryPage.userClickConfirm();
  }

  @When("User click add variant button")
  public void userClickAddVariantButton() {
    itemLibraryPage.userClickAddVariantButton();
  }

  @When("User click Create Modifier button")
  public void userClickCreateModifierButton() {
    modifiersPage.userClickCreateModifierButton();
  }
  @When("User input modifier name {string}")
  public void userInputModifierName(String  modifiername) {
    modifiersPage.userInputModifierName(modifiername);
  }

  @When("User click add or manage options")
  public void userClickAddOrManageOptions() {
    modifiersPage.userClickAddOrManageOptions();
  }

  @When("User click add options")
  public void userClickAddOptions() {
    modifiersPage.userClickAddOptions();
  }

  @When("User input nameoption {string}")
  public void userInputNameoption(String nameoption) {
    modifiersPage.userInputNameOption(nameoption);
  }

  @When("User input priceoption {string}")
  public void userInputPriceoption(String priceoption) {
    modifiersPage.userInputPriceOption(priceoption);
  }

  @When("User click save on add option pop up")
  public void userClickSaveOnAddOptionPopUp() {
    modifiersPage.userClickSaveOnAddOptionPopUp();
  }

  @When("User click save on modifier")
  public void userClickSaveOnModifier() {
    modifiersPage.userClickSaveOnModifier();
  }


  @When("User click Create Category")
  public void userClickCreateCategory() {
    categoriesPage.userClickCreateCategory();
  }

  @When("User input random Category name on BackOffice Categories")
  public void userInputRandomCategoryNameOnBackOfficeCategories() {
    categoriesPage.userInputCategoryName();
  }

  @When("User click save on category page")
  public void userClickSaveOnCategoryPage() {
    categoriesPage.userClickSaveOnCategoryPage();
  }
}
