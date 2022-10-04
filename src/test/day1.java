package test;

import org.testng.annotations.Test;

public class day1 {

	@Test
	public  void Demo()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Webdrivers\\edgedriver_win64\\Driver_Notes");

		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.close();

		//driver.quit();
	}
}
