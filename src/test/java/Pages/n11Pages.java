package Pages;

import Util.ElementHelper;
import org.apache.hc.client5.http.UserTokenHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class n11Pages {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    public static String productName;
static By loginUrl = By.name("https://www.n11.com/giris-yap");
static By emailArea = By.id("email");
    static By passportArea = By.id("password");
    static By loginButton = By.id("loginButton");
    static By search = By.id("searchData");
    static By searchClick = By.className("iconsSearch");
    static By thirdProduct = By.cssSelector("[data-position='3'] [title='Favorilere ekle']");
    static By myFavoritesButton = By.cssSelector(".btnMyFavorites");
    static By favorites =By.cssSelector("listItemProductList  a");
    static By deleteFavorites = By.cssSelector("deleteProFromFavorites");
    static By confirm = By.cssSelector("btn.btnBlack.confirm");
    static By emptyPage = By.cssSelector(".emptyWatchList");



    public n11Pages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void OpenLoginPage() {
        driver.get(String.valueOf(loginUrl));
        if (driver.getCurrentUrl().contains("giris-yap")) {
            System.out.println("Login sayfasındasınız");
            System.out.println("-----------------------------");
        } else {
            System.out.println("istenilen sayfaya gidemediniz");
            System.out.println("-----------------------------");
        }
    }

    public static void EnterEmailAndPassword() {
    elementHelper.click(emailArea);
    elementHelper.sendKey(emailArea, "testdeneme@gmail.com");
    elementHelper.click(passportArea);
    elementHelper.sendKey(passportArea, "test1234");
    elementHelper.click(loginButton);
    }

    public static void Search() {
        elementHelper.click(search);
        elementHelper.sendKey(search, "samsung");
        elementHelper.click(searchClick);
    }

    public static void SearchResult() {
        if (driver.getCurrentUrl().contains("arama") || driver.getCurrentUrl().contains("samsung")) {
            System.out.println("İstenilen arama hakkında sonuçlar bulundu");
            System.out.println("-----------------------------");
        } else {
            System.out.println("arama başarısızı oldu");
            System.out.println("-----------------------------");
        }
    }


    public static void ClickSecondPage() {
        driver.get("https://www.n11.com/arama?q=samsung&ipg=2");

    }

    public static void CheckSecondPage() {
        if (driver.getCurrentUrl().contains("arama") || driver.getCurrentUrl().contains("jpg=2")) {
            System.out.println("İstenilen sayfadasınız");
            System.out.println("-----------------------------");
        } else {
            System.out.println("başarısızı olundu");
            System.out.println("-----------------------------");
        }

    }

    public static void addFavorites() {
        elementHelper.click(thirdProduct);
    }

    public static void ClickMyFavorites() {
        elementHelper.click(myFavoritesButton);
    }

    public static void CheckFavorites() {
        elementHelper.click(favorites);
        productName = driver.findElement(By.cssSelector("div#view > ul  .columnContent .productName")).getText();
        System.out.println("seçilen 3. ürünün ismi: " + productName);
        System.out.println("-----------------------------");

    }

    public static void RemoveFavorites() {
        elementHelper.click(deleteFavorites);
        elementHelper.click(confirm);
    }

    public static void CheckRemoveFavorites() {
        WebElement checkProductDelete = driver.findElement(emptyPage);
        if (checkProductDelete != null) {
            System.out.println("Favori listesinde ürün bulunmamaktadır");
            System.out.println("-----------------------------");
        } else {
            System.out.println("İstediğiniz ürün silinemedi");
            System.out.println("-----------------------------");
        }
    }
}
