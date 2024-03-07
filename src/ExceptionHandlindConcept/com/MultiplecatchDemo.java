package ExceptionHandlindConcept.com;

public class MultiplecatchDemo {

	int a;
	
	
	public static void main(String[] args) {
		
		MultiplecatchDemo obj=new MultiplecatchDemo();
		obj=null;
		try
		{
			//int i=10/0;
			obj.a=40;
			
		    //int i=10/0;
		System.out.println("Hello");
		
		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println("AE is coming");
//		}
//		catch(NullPointerException ne)
//		{
//			System.out.println("NE  is coming");
//		}
//		catch(RuntimeException re)
//		{
//			System.out.println("NE  is coming");
//		}
		catch(Exception e)
		{
			System.out.println("NE  is coming");
			
			e.printStackTrace();
			
		}
		
		
		
		

	}

}
