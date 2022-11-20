import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/"); //ilgili adres
        driver.manage().window().maximize(); //tam ekran
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,450", "");
        //try {
        //    Thread.sleep(5000);
       // } catch(InterruptedException e) {
       //     throw new RuntimeException(e);
       // }
        WebElement elementButton = driver.findElement(By.cssSelector("body > div:nth-child(7) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > h5:nth-child(1)"));
        elementButton.click();


        driver.quit();  //tamamen kapatma, eğer close --- geçerli sekmeyi kapatır
    }
}
