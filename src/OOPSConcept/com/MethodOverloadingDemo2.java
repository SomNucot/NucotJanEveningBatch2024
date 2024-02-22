package OOPSConcept.com;

public class MethodOverloadingDemo2 {

	int a=10;
	static int  b=30;
	void show()
	{
		System.out.println("show method");
	}
	
	static void test()
	{
		
		System.out.println("test1");
		
	}
	
	static void test(int t1)
	{
		
		System.out.println("test1");
		
	}
	
	static void test(int t1,int t2)
	{
		System.out.println("test2");
	}
	
	static void test(int t1,int t2,int t3)
	{
		System.out.println("test3");
	}
	
	
	
	public static void main(String[] args) {
		MethodOverloadingDemo2 obj=new MethodOverloadingDemo2();
		System.out.println(obj.a);
		obj.show();
		
		//static data 
		//first way variable
		System.out.println(b);
		//classname.variable_name;
		System.out.println(MethodOverloadingDemo2.b);
		
		//first way to execute static method
		//--> methodname();
		
		test(10);
		test();
		
		//Secondt way to execute static method
				//-->Classname.methodname();
				
		MethodOverloadingDemo2.test();
		MethodOverloadingDemo2.test(10);
		

	}

}
