package ExceptionHandlindConcept.com;

public class ThrowsKeywordDemo {

	
	public void test1()
	{
		System.out.println("This is test one");
		test2();
		
	}
	public void test2()
	{
		System.out.println("This is test two");
		try
		{
			test3();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Ae is coming");
		}
		
	}
	public void test3() throws ArithmeticException
	{
		System.out.println("This is test three");
		test4();
	
	}
	public void test4() throws ArithmeticException
	{
		System.out.println("This is test four");
		
		int i=10/0;
	
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ThrowsKeywordDemo obj=new ThrowsKeywordDemo();
		
		obj.test1();
		
		

	}

}
