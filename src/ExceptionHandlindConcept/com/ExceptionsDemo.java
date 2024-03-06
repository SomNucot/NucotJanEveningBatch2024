package ExceptionHandlindConcept.com;

//To handle the exceptions in java we have 
		//try catch and finally block
		
		/*syntax
		 * 
		 * 
		 * try
		 * {
		 * 
		 * }
		 * catch()
		 * {
		 * 
		 * }
		 * finally()
		 * {
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
public class ExceptionsDemo {

	public static void main(String[] args) {
		
	
		System.out.println("Hello");
		try
		{
			int i=9/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("AE is coming");
			ae.printStackTrace();
			
			
		}
		
		System.out.println("Thanks");
		System.out.println("Thanks");
		System.out.println("Thanks");
		
		
		
		
		
		
		
		
		
		

	}

}
