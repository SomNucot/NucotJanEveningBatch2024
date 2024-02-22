package OOPSConcept.com;

public class StaticDemo2 {

	int aa=20;
	static int a=20;

	
	
	void display()
	{
		System.out.println("normal method");
		System.out.println(a);
		System.out.println(aa);
	}
	
	
	
	
	
	public static void test()
	{
		//System.out.println(aa);-->inside the static method we cannot use normal variables
		System.out.println("this is static method");
		
		System.out.println(a);
		
	}
	
	
	//static block-->All ways this will execute first
	
	
	/*
	 * syntax
	 * 
	 * static
	 * {
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 */
	
	static
	{
		//System.out.println(aa);
		System.out.println(a);
		
		System.out.println("Welcome-1");
		System.out.println("Welcome-2");
		System.out.println("Welcome-3");
		
	}

	public static void main(String[] args) {
		System.out.println(StaticDemo2.a);
		System.out.println(a);
		StaticDemo2.test();
		test();
		

	}

}
