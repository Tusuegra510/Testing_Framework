package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class BasePage {

	protected static WebDriver driver;
	private static WebDriverWait wait;
	private static Actions actions;

	static {
		System.setProperty("webdriver.chrome.driver", "F:\\Java practice\\drivers\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		wait = new WebDriverWait(driver, 10);
	}

	public BasePage(WebDriver driver){
		BasePage.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}

	public static void navigateTo(String url){
		driver.get(url);
	}

	private WebElement Find(String locator){
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}

	public void clickElement(String locator){
		Find(locator).click();
	}

	public void write(String locator, String textToWrite){
		Find(locator).clear();
		Find(locator).sendKeys(textToWrite);
	}

	public void selectFromDropdownByValue(String locator, String valueToSelect){
		Select dropdown = new Select(Find(locator));
		dropdown.selectByValue(valueToSelect);
	}

	public void selectFromDropdownByIndex(String locator, int valueToSelect){
		Select dropdown = new Select(Find(locator));
		dropdown.selectByIndex(valueToSelect);
	}

	public void selectFromDropdownByText(String locator, String valueToSelect){
		Select dropdown = new Select(Find(locator));
		dropdown.selectByVisibleText(valueToSelect);
	}

	public void hoverOverElement(String locator){
		actions.moveToElement(Find(locator));
	}

	public void doubleClick(String locator){
		actions.doubleClick(Find(locator));
	}

	public void contextClick(String locator){
		actions.contextClick(Find(locator));
	}

}
