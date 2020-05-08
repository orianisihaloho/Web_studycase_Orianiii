package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.AndroidDriverInstance;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ItemLibraryPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void inputItemName(){
    String itemName = RandomUtils.generateRandomFoodName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='name' and @placeholder='Item Name']")).sendKeys(itemName);
  }
  public void userClickCreateItemButton() {
    waitAbit(5000);
   WebDriverInstance.webDriver
            .findElement(By.xpath("//button[@class ='btn btn-primary' and text()='Create Item']")).click();
  }
  public void waitAbit(int millis){
    try{
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void userClickCategorized() {
    WebDriverInstance.webDriver
            .findElement(By.id("filterSelectCategory")).click();
  }
//option[text()='Uncategorized' ]


  public void userInputPrice(String price) {
    WebElement inputPrice = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']"));                    // find searchInput by ID
    inputPrice.sendKeys(price);
  }

  public void userInputSKU(String sku) {
    WebElement SKU = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='SKU']"));                    // find searchInput by ID
    SKU.sendKeys(sku);
  }
  public void userAddVariant() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[text()='Add Variant']")).click();
  }
  public void userClickAddVariantButton() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//a[@class='btn btn-primary btn-block' and text()='Add Variant']")).click();
  }
  public void userInputVariant(String variant) {
    WebElement inputVariant = WebDriverInstance.webDriver.findElement(By.xpath(" //input[@name='item_variants[1].name']"));                    // find searchInput by ID
    inputVariant.sendKeys(variant);
  }
  public void userInputVariantPrice(String variantprice) {
    WebElement inputVariantPrice = WebDriverInstance.webDriver.findElement(By.xpath(" //input[@name='item_variants[1].price']"));                    // find searchInput by ID
    inputVariantPrice.sendKeys(variantprice);
  }
  public void userInputVariantSku(String variantsku) {
    WebElement inputVariantSku = WebDriverInstance.webDriver.findElement(By.xpath(" //input[@name='item_variants[1].sku']"));                    // find searchInput by ID
    inputVariantSku.sendKeys(variantsku);
  }

  public void userClickConfirm() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[@class ='btn btn-primary' and text()='Confirm']")).click();
  }
  public void userClickSave() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[@class='btn btn-primary no-outline' and text()='Save']")).click();
  }



  }

