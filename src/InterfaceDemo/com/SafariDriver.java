package InterfaceDemo.com;

public class SafariDriver implements WebDriver {

	@Override
	public void get(String url) {
		System.out.println("Open the application in safari");
		
	}

	@Override
	public void click(String element) {
		System.out.println("click on the element in safari");
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Pass the value to the input box in safari");
		
	}

	@Override
	public void close() {
		System.out.println("close the application in safari");
	}

	@Override
	public void findelement() {
		// TODO Auto-generated method stub
		
	}
	
	

}
