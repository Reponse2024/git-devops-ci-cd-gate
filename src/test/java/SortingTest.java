import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.*;

public class SortingTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--headless", "--no-sandbox", "--disable-dev-shm-usage", "--window-size=1920,1080");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    private void waitForPageReady() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(".loader, .loading, app-loading, [class*='spinner'], [class*='loading']")));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("[data-test='product-name']")));
    }
    private List<String> sortAndGetProductNames(String sortOptionValue) {
        driver.get("https://practicesoftwaretesting.com/");
        waitForPageReady();
        String firstNameBefore = driver
                .findElement(By.cssSelector("[data-test='product-name']"))
                .getText().trim();
        WebElement sortDropdown = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='sort']")));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[1];", sortDropdown, sortOptionValue);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].dispatchEvent(new Event('change'))", sortDropdown);
        wait.until(driver -> {
            List<WebElement> products = driver.findElements(
                    By.cssSelector("[data-test='product-name']"));
            if (products.isEmpty()) return false;
            try {
                return !products.getFirst().getText().trim().equals(firstNameBefore);
            } catch (StaleElementReferenceException e) {
                return false;
            }
        });
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.cssSelector("[data-test='product-name']")));
        List<String> names = new ArrayList<>();
        for (WebElement el : driver.findElements(By.cssSelector("[data-test='product-name']"))) {
            try {
                names.add(el.getText().toLowerCase().trim());
            } catch (StaleElementReferenceException e) {
                // Skipping any element that went stale during collection
            }
        }
        return names;
    }

    @Test
    public void testSortByNameAscending() {
        // "name,asc" is the value attribute of the A-Z option in the dropdown
        List<String> actual = sortAndGetProductNames("name,asc");

        List<String> expected = new ArrayList<>(actual);
        Collections.sort(expected);

        System.out.println("A-Z result: " + actual);
        Assert.assertEquals(actual, expected, "Products are not sorted A-Z");
    }

    @Test
    public void testSortByNameDescending() {
        List<String> actual = sortAndGetProductNames("name,desc");
        List<String> expected = new ArrayList<>(actual);
        expected.sort(Collections.reverseOrder());
        System.out.println("Z-A result: " + actual);
        Assert.assertEquals(actual, expected, "Products are not sorted Z-A");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}