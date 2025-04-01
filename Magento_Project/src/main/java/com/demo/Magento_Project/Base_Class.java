package com.demo.Magento_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver d;

	// BROWSER LAUNCH

	public static void Browser_launch(String Browsers) {
		if (Browsers.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			d.manage().window().maximize();
		} else if (Browsers.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
			d.manage().window().maximize();
		} else if (Browsers.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver();
			d = new FirefoxDriver();
			d.manage().window().maximize();
		}

	}

	// URL
	public static void Url(String link) {
		d.get(link);
	}

	// CLOSE AND QIUT

	public static void Close_Quit(String Exit) {
		if (Exit.equalsIgnoreCase("close")) {
			d.close();
			System.out.println("CLOSED");
		} else {
			d.quit();
			System.out.println("QUIT");
		}

	}

	// NAVIGATE TO

	public static void navigate_to(String url) {
		d.navigate().to(url);

	}

	// NAVIGATE METHODS

	public static void navigations(String navigate) {
		if (navigate.equalsIgnoreCase("back")) {
			d.navigate().back();
		} else if (navigate.equalsIgnoreCase("forward")) {
			d.navigate().forward();
		} else if (navigate.equalsIgnoreCase("refresh")) {
			d.navigate().refresh();
		}

	}

	// SCREENSHOT

	public static void Screenshot(String Location, String type) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) d;
		File s2 = ss.getScreenshotAs(OutputType.FILE);
		File s3 = new File(Location);
		if (type.equalsIgnoreCase("filehandler")) {
			FileHandler.copy(s2, s3);
		} else {
			FileUtils.copyFile(s2, s3);
		}

	}

	// GET METHODS

	public static void Get_methods(String methods) {
		if (methods.equalsIgnoreCase("title")) {
			System.out.println(d.getTitle());
		} else if (methods.equalsIgnoreCase("Current_url")) {
			System.out.println(d.getCurrentUrl());
		} else if (methods.equalsIgnoreCase("pagesource")) {
			System.out.println(d.getPageSource());
		}
	}

	// WINDOW HANDLES

	public static void window_handles(String single) {
		if (single.equalsIgnoreCase("windowhandle")) {
			System.out.println(d.getWindowHandle());
		} else {
			Set<String> windowHandles = d.getWindowHandles();
			System.out.println(windowHandles);

		}
	}

	// SENDKEYS

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	// CLICK

	public static void click(WebElement element) {
		element.click();
	}

	// ALERT        https://demo.automationtesting.in/Alerts.html

	public static void alert(String type, String value) {
		if (type.equalsIgnoreCase("accept")) {
			d.switchTo().alert().accept();
		} else if (type.equalsIgnoreCase("ans")) {
			d.switchTo().alert().sendKeys(value);

		} else if (type.equalsIgnoreCase("dismiss")) {
			d.switchTo().alert().dismiss();
		}

	}

	// FRAMES         https://demo.automationtesting.in/Frames.html

	public static void frames(String type, WebElement element, String value) {
		if (type.equalsIgnoreCase("webelement")) {
			d.switchTo().frame(element);
		} else if (type.equalsIgnoreCase("name&id")) {
			d.switchTo().frame(value);
		} else if (type.equalsIgnoreCase("index")) {
			int ab = Integer.parseInt(value);
			d.switchTo().frame(ab);

		} else if (type.equalsIgnoreCase("parentframe")) {
			d.switchTo().parentFrame();
		} else if (type.equalsIgnoreCase("defaultcontent")) {
			d.switchTo().defaultContent();
		}
	}

	// ROBOT

	public static void keyboard(String keys) throws AWTException {
		Robot r = new Robot();
		if (keys.equalsIgnoreCase("0")) {
			r.keyPress(KeyEvent.VK_0);
			r.keyRelease(KeyEvent.VK_0);
		} else if (keys.equalsIgnoreCase("1")) {
			r.keyPress(KeyEvent.VK_1);
			r.keyRelease(KeyEvent.VK_1);
		} else if (keys.equalsIgnoreCase("2")) {
			r.keyPress(KeyEvent.VK_2);
			r.keyRelease(KeyEvent.VK_2);
		} else if (keys.equalsIgnoreCase("3")) {
			r.keyPress(KeyEvent.VK_3);
			r.keyRelease(KeyEvent.VK_3);
		} else if (keys.equalsIgnoreCase("4")) {
			r.keyPress(KeyEvent.VK_4);
			r.keyRelease(KeyEvent.VK_4);
		} else if (keys.equalsIgnoreCase("5")) {
			r.keyPress(KeyEvent.VK_5);
			r.keyRelease(KeyEvent.VK_5);
		} else if (keys.equalsIgnoreCase("6")) {
			r.keyPress(KeyEvent.VK_6);
			r.keyRelease(KeyEvent.VK_6);
		} else if (keys.equalsIgnoreCase("7")) {
			r.keyPress(KeyEvent.VK_7);
			r.keyRelease(KeyEvent.VK_7);
		} else if (keys.equalsIgnoreCase("8")) {
			r.keyPress(KeyEvent.VK_8);
			r.keyRelease(KeyEvent.VK_8);
		} else if (keys.equalsIgnoreCase("9")) {
			r.keyPress(KeyEvent.VK_9);
			r.keyRelease(KeyEvent.VK_9);
		} else if (keys.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} else if (keys.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (keys.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		} else if (keys.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		} else if (keys.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		} else if (keys.equalsIgnoreCase("backspace")) {
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
		} else if (keys.equalsIgnoreCase("space")) {
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_SPACE);
		} else if (keys.equalsIgnoreCase("control")) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
	}

	// DROPDOWN METHODS

	public static void Dropdown(String method, WebElement element, String value) {

		Select dd = new Select(element);

		if (method.equalsIgnoreCase("selectbyindex")) {
			int index = Integer.parseInt(value);
			dd.selectByIndex(index);

		} else if (method.equalsIgnoreCase("deselectbyindex")) {
			int index = Integer.parseInt(value);
			dd.deselectByIndex(index);
			System.out.println("worked");

		} else if (method.equalsIgnoreCase("selectbyvalue")) {
			dd.selectByValue(value);

		} else if (method.equalsIgnoreCase("deselctbyvalue")) {
			dd.deselectByValue(value);

		} else if (method.equalsIgnoreCase("selectByVisibleText")) {
			dd.selectByVisibleText(value);

		} else if (method.equalsIgnoreCase("deselectByVisibleText")) {
			dd.deselectByVisibleText(value);

		} else if (method.equalsIgnoreCase("ismultiple")) {
			System.out.println(dd.isMultiple());

		} else if (method.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = dd.getOptions();
			for (int i = 0; i < options.size(); i++)
				System.out.println(options.get(i).getText());

		} else if (method.equalsIgnoreCase("getallselectedoption")) {
			List<WebElement> allSelectedOptions = dd.getAllSelectedOptions();
			for (WebElement ab : allSelectedOptions) {
				System.out.println(ab.getText());
			}

		} else if (method.equalsIgnoreCase("getfirstselectedoption")) {
			WebElement firstSelectedOption = dd.getFirstSelectedOption();
			System.out.println(firstSelectedOption);

		} else if (method.equalsIgnoreCase("deselectall")) {
			dd.deselectAll();

		}

	}

	// MOUSE ACTIONS        https://www.leafground.com/drag.xhtml

	public static void Mouse_Actions(String action, WebElement element, int x, int y) {

		Actions ac = new Actions(d);

		if (action.equalsIgnoreCase("click")) {

			ac.click(element).perform();
		} else if (action.equalsIgnoreCase("contextclick")) {

			ac.contextClick(element).perform();

		} else if (action.equalsIgnoreCase("doubleclick")) {

			ac.doubleClick(element).perform();
		} else if (action.equalsIgnoreCase("clickandhold")) {

			ac.clickAndHold(element).perform();

		} else if (action.equalsIgnoreCase("draganddrop")) {

			ac.dragAndDropBy(element, x, y).perform();
		} else if (action.equalsIgnoreCase("movetoelement")) {

			ac.moveToElement(element, x, y).perform();
		}

	}

	// WITHOUT ELEMENT

	public static void Mouse_ac(String type, WebElement source) {

		Actions ac = new Actions(d);

		if (type.equalsIgnoreCase("click")) {

			ac.click().perform();
		} else if (type.equalsIgnoreCase("contextclick")) {

			ac.contextClick().perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {

			ac.doubleClick().perform();
		} else if (type.equalsIgnoreCase("clickandhold")) {

			ac.clickAndHold().perform();
		} else if (type.equalsIgnoreCase("draganddrop")) {

			ac.dragAndDrop(source, source).perform();
		} else if (type.equalsIgnoreCase("movetoelement")) {

			ac.moveToElement(source).perform();
		}

	}

	// JAVASCRIPT SCROLLDOWN AND SCROLLUP

	public static void scrolling(String scroll, int X, int Y) {
		
		JavascriptExecutor js = (JavascriptExecutor) d;

		if (scroll.equalsIgnoreCase("Down")) {
			js.executeScript("window.scroll(" + X + "," + Y + ")");

		} else if (scroll.equalsIgnoreCase("up")) {
			js.executeScript("window.scroll(" + X + "," + Y + ");");
			System.out.println("SCROLLED");
			
		}else if (scroll.equalsIgnoreCase("bottom")) {
			js.executeScript("window.scrollby(0,document.body.scrollHeight)");
		}
			
		

	}

}
