package InterfaceDemo.com;

public class ChromeDriver implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("Open the application in chrome ");
		
	}

	@Override
	public void click(String element) {
		System.out.println("click on the element   in chrome");
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Pass the value to the input box in chrome");
		
	}

	@Override
	public void close() {
		System.out.println("close the application in chrome");
	}

	@Override
	public void findelement() {
		System.out.println("WebElement");
		
	}

}
