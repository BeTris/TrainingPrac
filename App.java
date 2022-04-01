
package MavenProject1.MavenProg1;

	  import org.openqa.selenium.By;
	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;
	  import org.testng.Assert;


	  public class App {

	  	public static void main(String[] args) throws InterruptedException {
	  		// TODO Auto-generated method stub
	  		// System Property for chrome Driver   
	  	    //System.setProperty("webdriver.chrome.driver", "D:\\Training\\Selenium\\chromedriver.exe");  
	  		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEGHCHAK\\Desktop\\MODULE 3\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe"); 
	  	    // Create a new instance of the Chrome driver 
	  		WebDriver driver = new ChromeDriver(); 
	  		
	  		driver.get("http://demo.guru99.com/test/radio.html"); 
	  		Thread.sleep(3000);

	  		//check that option1 button is not selected
	  		Assert.assertFalse(driver.findElement(By.id("vfb-7-1")).isSelected());
	  				
	  		
	  		//click button
	  		driver.findElement(By.id("vfb-7-1")).click();
	  		
	  		//isSelected will return true or false value
	  		System.out.println(driver.findElement(By.id("vfb-7-1")).isSelected());
	  		
	  		//check that option1 button is selected
	  		Assert.assertTrue(driver.findElement(By.id("vfb-7-1")).isSelected());
	  		
	  		driver.close();
	  	}

	  }





/*
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Select USD option from dropdown and verify from script that USD option is selected
//Use another methods of select to select different options

public class StaticDropDown {
	
    public static void main(String[] args) {  

    // System Property for chrome Driver   
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEGHCHAK\\Desktop\\MODULE 3\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe"); 
	
    // Create a new instance of the Chrome driver 
	WebDriver driver = new ChromeDriver(); 
	
	// Storing the Application Url in the String variable 
	String url = "https://www.rahulshettyacademy.com/dropdownsPractise/"; 
	
	//Launch the  WebSite 
	driver.get(url); 

	//find dropdown element
	WebElement staticDropDown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
	//create object of select class
	Select dropdown = new Select(staticDropDown);  
	
	//As this is static dropdown, order will not change
	//find USD option  using index method
	dropdown.selectByIndex(3);
	
	//Check whether USD is selected or not- Verify
	WebElement selectedElement=dropdown.getFirstSelectedOption();
	
	System.out.println(selectedElement.getText());
	
	//use selectByVisibleText method to select option from dropown
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());

	//use selectByValue method to select option from dropown
	dropdown.selectByValue("INR");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	driver.close();
	

	}
}*/





/*import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Find autosuggestive dropdown elemnet and send keys
//Get all options and select India from those options
public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System Property for chrome Driver   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEGHCHAK\\Desktop\\MODULE 3\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe"); 
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
		
		//get URL
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Find element and send key
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		//get all options 
		List<WebElement> options =driver.findElements(By.cssSelector("a[class='ui-corner-all']"));
	
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
					option.click();
					break;

			}
		}

		driver.close();
	}

}
*/

	  /*//Select checkbox2 option- Find all checkboxes value, check whether checkbox2 exists or not, if it 
//exits then select checkbox2


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System Property for chrome Driver   
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEGHCHAK\\Desktop\\MODULE 3\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe"); 
		
	    // Create a new instance of the Chrome driver 
		WebDriver driver = new ChromeDriver(); 
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.get("http://demo.guru99.com/test/radio.html"); 
		Thread.sleep(3000);
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='checkbox' and @name='webform']")));

		List<WebElement> checkbox=driver.findElements(By.xpath("//*[@type='checkbox' and @name='webform']"));
		int size=checkbox.size();
		System.out.println(size);

		for(int i=0; i<size; i++) {
			
			if(checkbox.get(i).getAttribute("value").contains("checkbox2")) {
				System.out.println("Inside loop");
				
				checkbox.get(i).click();
				System.out.println("Clicked Checkbox");
				break;
			}
			
		}
		
		driver.close();
	}

}
*/






