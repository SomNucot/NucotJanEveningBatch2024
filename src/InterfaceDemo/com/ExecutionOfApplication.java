package InterfaceDemo.com;

public class ExecutionOfApplication {

	public static void main(String[] args) {
		
		//test app in chrome driver
		System.out.println("*************In chrome browser****************");
		ChromeDriver cd=new ChromeDriver();
		cd.click("Login button");
		cd.findelement();
		cd.get("https://www.flipkart.com");
		cd.sendKeys("search input box", "mobiles");
		cd.close();
		
		//test app in firefox driver
		System.out.println("*************In firefox browser****************");
		FirefoxDriver fd=new FirefoxDriver();
		fd.click("Login button");
		fd.findelement();
		fd.get("https://www.flipkart.com");
		fd.sendKeys("search input box", "mobiles");
		fd.close();
		
		
		
		//test app in Safari browser 
		System.out.println("*************In safari browser****************");
		SafariDriver sd=new SafariDriver();
		sd.click("Login button");
		sd.findelement();
		sd.get("https://www.flipkart.com");
		sd.sendKeys("search input box", "mobiles");
		sd.close();
		
		
		
		
	}

}
