package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseFinal {

	
	public static WebDriver driver;
	public static Properties prop;
	 
	
	public TestBaseFinal() 
	{
	String path= System.getProperty("user.dir") + "//src//test//resources//Config//Config.properties";
	FileInputStream fin;
	prop= new Properties();
	
	  try {
		fin = new FileInputStream(path);
		prop.load(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	  
	
	}
	
	public static void initialization()
	{
		
		String brw= prop.getProperty("browser");
		if(brw.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(brw.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get(prop.getProperty("url"));
		
	}
	
}
