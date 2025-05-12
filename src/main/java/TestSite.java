import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSite {
    public static void main(String[]args){
        WebDriver driver;
        driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        //localisation
        driver.findElement(By.id("user-name"));
        //path relative
        driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
        driver.findElement(By.name("password"));
        driver.findElement(By.xpath("//input[@id=\"password\"]"));
        driver.findElement(By.className("submit-button"));
        driver.findElement(By.xpath("//input[@data-test=\"login-button\"]"));
        driver.quit();
    }
}
