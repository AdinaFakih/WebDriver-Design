package OOP2;

public class AmazonTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.findElement("name");
		
		driver.close();
		
		driver.quit();
		
			
	}
}