package OOPSConcept.com;

public class ConstructorDemo {

	
	
	String name;
	int age;
	double salary;
	
	
	
	
	
	//Class---> contains Constructors
	//1.Constructors name should be same as class name
	
	
	void show()
	{
		System.out.println("Show");
	}
	
	
	//name is as same as the class name
	//cannot have any return type value/ void int float etc
	//no return type
	//constructor will be called when we create object
	//constructor are  used to init
	/*
	 * 
	 * class_name()
	 * {
	 * 
	 * 			body
	 * 		
	 * }
	 * 
	 * 
	 * 
	 * 
	 */
	
	//two types of Constructor
	//1.default Constructor
	//2.Parametizsed 
	
	
	//1.default Constructor(zero)
	ConstructorDemo()
	{
		
		System.out.println("This is constructor");
		
		
	}
	
	
	
	//2.Parametizsed 
	ConstructorDemo(String n,int a,double s)
	{
		System.out.println("This is three param constructor");
		name=n;
		age=a;
		salary=s;
		
		
		System.out.println("The name is-->"+name);
		System.out.println("The age is-->"+a);
		System.out.println("The salary is-->"+salary);
		
		
	}
	
	
	
	//2.Parametizsed 
		ConstructorDemo(String name,int age)
		{
			System.out.println("This is 2 param constructor");
			this.name=name;
			this.age=age;
	
			System.out.println("The name is-->"+this.name);
			System.out.println("The age is-->"+this.age);
			
			
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ConstructorDemo  obj=new ConstructorDemo();
		
		System.out.println(obj.name="Nucot");
		System.out.println(obj.age=25);
		System.out.println(obj.salary=12456.000);
		/*
		obj.name="Nucot";
		obj.age=25;
		obj.salary=12456.000;
		*/
		
		ConstructorDemo  obj1=new ConstructorDemo("Modi",40,300000.0);
		
		ConstructorDemo  obj2=new ConstructorDemo("Nucot",12);

	}

}
