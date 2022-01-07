// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class OpenCartMarketplaceTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void openCartMarketplace() {
    driver.get("https://www.opencart.com/");
    driver.manage().window().setSize(new Dimension(1440, 900));
    driver.findElement(By.cssSelector(".nav > li:nth-child(3) > a")).click();
    driver.findElement(By.cssSelector(".hidden-sm > .btn:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".hidden-xs > .btn:nth-child(3)")).click();
    driver.findElement(By.linkText("Marketplaces")).click();
    driver.findElement(By.linkText("Themes")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, 10);
      wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Languages")));
    }
    driver.findElement(By.linkText("Languages")).click();
    driver.findElement(By.linkText("Payment Gateways")).click();
    driver.findElement(By.linkText("Shipping Methods")).click();
    driver.findElement(By.linkText("Modules")).click();
    driver.findElement(By.linkText("Order Totals")).click();
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Recently Added']")).click();
    }
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Rating']")).click();
    }
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Name']")).click();
    }
    driver.findElement(By.id("input-sort")).click();
    {
      WebElement dropdown = driver.findElement(By.id("input-sort"));
      dropdown.findElement(By.xpath("//option[. = 'Price']")).click();
    }
  }
}
