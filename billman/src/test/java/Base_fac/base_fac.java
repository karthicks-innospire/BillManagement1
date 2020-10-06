package Base_fac;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_fac {
	public static WebDriver driver;
		
	public static void browserFac(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firfox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.iedriver().arch64().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void sendValue(WebElement element, String data) {
			element.clear();
		if (element.isEnabled()) {
			element.sendKeys(data);
		}
	}

	public static void buttClick(WebElement element) {
		if (element.isEnabled()) {
			element.click();
		}
	}

	public static void selectDropdow(WebElement element, String index) {
		Select data = new Select(element);
		try {
			data.selectByValue(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void selectDropdownVtext(WebElement element, String name) {

		Select vdata = new Select(element);
		try {
			vdata.selectByVisibleText(name);
		} catch (Exception e) {
			e.printStackTrace();
	 	}

	}

	public static void snapShot(String snapshotname){
		java.io.File snapshotloc=new java.io.File("./snapshot/"+snapshotname+".png");
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		java.io.File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, snapshotloc);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ScreenShot Taken");
	}
	
}
