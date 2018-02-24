package googleSearch;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testUtil.BaseClass;

public class SearchGoogleByValue extends BaseClass {

	@Test
	// Search for Input value as "testing" and submit
	public void searchButton() {

		driver.get("http://www.google.de");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).submit();
		String searchTitle = driver.getTitle();
		System.out.println("Google Search Page Title is --->" + searchTitle);
	}

}
