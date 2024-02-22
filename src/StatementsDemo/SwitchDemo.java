package StatementsDemo;

public class SwitchDemo {

	public static void main(String[] args) {
		
		
		//switch statement
		/*
		 * 
		 * switch(expression)
		 * {
		 * 		
		 * 		case value:
		 * 					statements
		 * 			break;
		 * 
		 * 		case value:
		 * 					statements
		 * 			break;
		 * 		case value:
		 * 					statements
		 * 			break;
		 * 
		 * 
		 * 		case value:
		 * 					statements
		 * 			break;
		 * 
		 * 
		 * 		default:
		 * 					statements
		 * 			break;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		
		
		String browserName="modi";
		
		
		switch(browserName)
		{
		
		
			case "chrome":
							System.out.println("Launch chrome browser");
							break;
		
			case "firefox":
						System.out.println("Launch firefox browser");
						break;
		
			case "ie":
						System.out.println("Launch ie browser");
						break;
				
			case "safari":
						System.out.println("Launch safari browser");
						break;
				
			case "edge":
						System.out.println("Launch edge browser");
						break;
				
			case "opera":
						System.out.println("Launch opera browser");
						break;
				
				
			default:
						System.out.println("Pass right browser name");
					break;
				
				
				
				
				
				
				
		
		}
		
		
		
		System.out.println("Thanks");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
