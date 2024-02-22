package OOPSConcept.com;

public class StaticDemo {

	int a=20;
	static int b=10;
	

	
	void show1()
	{
		System.out.println("Show1");
	}
	
	
	static void show2()
	{
		System.out.println("Show2");
	}
	
	static
	{
		System.out.println("This is static block");
	}
	
	

	public static void main(String[] args) {
		
		StaticDemo obj=new StaticDemo();
		
		System.out.println(obj.a);
		
		obj.show1();
		//two ways to access static variables
		
		//first way to execute static variables---> Class_name.variable_name
		System.out.println("Printing first way static variables-->"+StaticDemo.b);
		
		
		//Second way---> variable_name
		
		System.out.println("Printing Second way static variables-->"+b);
		
		//first way to execute static  method---> Class_name.Method_name
		
		StaticDemo.show2();
		
		
		//Second way to execute static  method---> method_name
		
		show2();
		

	}

}
