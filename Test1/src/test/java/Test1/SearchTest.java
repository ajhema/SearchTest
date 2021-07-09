package Test1;

import org.openqa.selenium.WebDriver;


public class SearchTest {

	
		public void testSetup() 
		{
		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_csharp_search/862b0faa506b8487c25a3384cfde8af4/static/attachments/reference_page.html");
		}
		
        public void testQueryInputField()
        {
        	if((driver.findElement(By.id("search-input"))).size() != 0)
        	{
        		System.out.println("element present");
        	}
        	else
        	{
        		System.out.println("element not present");
        	}
        	
        }
        
        public void testSearchButton()
        {
        	if((driver.findElement(By.id("search-button"))).size() != 0)
        	{
        		System.out.println("button present");
        	}
        	else
        	{
        		System.out.println("button not present");
        	}
        	
        }
        
        public void testEmptySearch()
        {
        	driver.findElement((By.id("search-button")).click();
        	driver.findElement(By.id("error-empty-query"));
        	//Assert.assertTure();
        }
		
		
	}


