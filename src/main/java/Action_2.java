import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Action_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        WebElement RadioButton = driver.findElement(By.name("tab"));
        RadioButton.click();
        WebElement localisationMessage= driver.findElement(By.id("check"));
        String contenumessage= localisationMessage.getText();
        if (contenumessage.contains("Yes")) {
            System.out.println("checked");
        } else {
            System.out.println("not checked");
        }
        WebElement Checkbox =driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[2]"));
        Checkbox.click();
        WebElement mainbox1=driver.findElement(By.id("c_bs_1"));
        mainbox1.click();
        WebElement mainbox2=driver.findElement(By.id("c_bs_2"));
        mainbox2.click();
        //if(contenumessage.equals("You have checked"));
        //Thread.sleep(600);
    }
}
