import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
       WebElement username= driver.findElement(By.id("user-name"));
       username.sendKeys("standard_user");
       WebElement password= driver.findElement(By.id("password"));
       password.sendKeys("secret_sauce");
       WebElement login = driver.findElement(By.id("login-button"));
       login.click();
      WebElement dropdown = driver.findElement(By.xpath("//select[@data-test=\"product-sort-container\"]"));
     Select select =new Select(dropdown);
    //select.selectByValue("lohi");
       // select.selectByIndex(1);
        select.selectByVisibleText("Price (high to low)");
    Thread.sleep(300);
    driver.close();






    }
}