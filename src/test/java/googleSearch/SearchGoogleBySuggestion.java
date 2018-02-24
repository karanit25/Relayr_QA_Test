package googleSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testUtil.BaseClass;

public class SearchGoogleBySuggestion extends BaseClass {

	@Test
	public void suggestion() {

		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("apple");
		// Take all the suggestion in a list and iterate to find "store" in
		// suggested options then click on it
		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		System.out.println("Total No of Suggestions--->" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("store")) {
				list.get(i).click();
				break;
			}

		}
		String searchTitle = driver.getTitle();
		System.out.println("Google Search Page Title is --->" + searchTitle);
	}

}
