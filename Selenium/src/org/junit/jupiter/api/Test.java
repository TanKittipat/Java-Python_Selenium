package org.junit.jupiter.api;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Test {

	void testOpenWebsiteGoogle() {
        WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // Find the search input element by its name attribute
        WebElement searchInput = driver.findElement(By.name("q"));

        // Enter the search query
        searchInput.sendKeys("PWS NPRU");

        // Submit the search query
        searchInput.submit();
        
        // Get the search results page body text
        String pageSource = driver.getPageSource();

        // Perform the assertion to check if the expected text is displayed
        String expectedText = "PWS NPRU"; // Replace with the text you expect to be displayed
        assertTrue(pageSource.contains(expectedText),
                "Expected text: '" + expectedText + "' not found on the search results page.");       
        
        //driver.quit();
	}

	private void assertTrue(boolean contains, String string) {
		// TODO Auto-generated method stub
		
	}

}