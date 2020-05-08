package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;

public class CategoriesPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void userClickCreateCategory() {
    waitAbit(5000);
   WebDriverInstance.webDriver
           .findElement(By.xpath("//button[@class ='btn btn-primary' and text()='Create Category']")).click();
}
  public void waitAbit(int millis){
    try{
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  public void userInputCategoryName(){
    String categoryName = RandomUtils.generateRandomCategoryName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='name' and @placeholder='Category Name']")).sendKeys(categoryName);
  }

  public void userClickSaveOnCategoryPage() {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//button[text()='Save']")).click();
  }
}
