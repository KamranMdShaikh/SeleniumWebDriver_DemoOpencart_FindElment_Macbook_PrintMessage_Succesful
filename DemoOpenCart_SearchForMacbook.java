import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoOpenCart_SearchForMacbook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver test = new ChromeDriver();
		
		test.get("https://demo.opencart.com/");
		test.findElement(By.xpath("//INPUT[@type='text']")).sendKeys("macbook");
		test.findElement(By.xpath("(//BUTTON[@type='button'])[4]")).click();
		
		Thread.sleep(2000);

		test.findElement(By.xpath("//A[@href='https://demo.opencart.com/index.php?route=product/product&product_id=43&search=macbook'][text()='MacBook']")).click();
		Thread.sleep(2000);

		if(test.findElement(By.cssSelector("#content > div > div.col-sm-4 > h1")) != null)
			System.out.println("Successfully searched MacBook");
		else
			System.out.println("unsuccessfule");
		
		
		test.close();
		
	}

}
