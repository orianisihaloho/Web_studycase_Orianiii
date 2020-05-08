package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModifiersPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }


  public void userClickCreateModifierButton() {
    waitAbit(5000);
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[text()='Create Modifier']")).click();
  }

  public void waitAbit(int millis){
    try{
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
//  public void inputItemName(){
//    String itemName = RandomUtils.generateRandomFoodName();
//    WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='name' and @placeholder='Item Name']")).sendKeys(itemName);
//  }
  @When("User input modifier name")
  public void userInputModifierName(String modifiername) {
//    String modifiername = RandomUtils.generateRandomModifierName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='name' and @placeholder='Name']")).sendKeys(modifiername);

  }

  public void userClickAddOrManageOptions() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[text()='Add or Manage Options']")).click();
  }

  public void userClickAddOptions() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[text()='Add Options']")).click();
  }

  public void userInputNameOption(String nameoption) {
    WebElement nameoption_ = WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='options[1].name']"));
    nameoption_.sendKeys(nameoption);
  }
  public void userInputPriceOption(String priceoption) {
    WebElement priceoption_ = WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='options[1].price']"));
    priceoption_.sendKeys(priceoption);
  }
  public void userClickSaveOnAddOptionPopUp() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[@class='btn btn-primary' and text()='Save']")).click();
  }

  public void userClickSaveOnModifier() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[@class='btn btn-primary' and text()='Save']")).click();
  }
}
